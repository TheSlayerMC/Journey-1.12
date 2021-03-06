package net.journey.common.capability.innercaps;

import net.journey.api.capability.PlayerStats;
import net.journey.common.capability.SerializableInnerCap;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;

public class KnowledgeStorageImpl extends SerializableInnerCap<NBTTagCompound, KnowledgeStorageImpl> implements PlayerStats.KnowledgeStorage {
	private float amountOnLevel;
	private int levels;

	@Override
	public void add(float amount) {
		if (amountOnLevel + amount >= getLevelCapacity(levels)) {
			amountOnLevel = amountOnLevel + amount - getLevelCapacity(levels);
			levels += 1;
		} else {
			amountOnLevel += amount;
		}
	}

	@Override
	public float remove(float amount) {
		float total = getTotal();

		//nullifies stored knowledge if amount to remove is bigger than stored one
		if (amount > total) {
			float left = amount - total;

			levels = 0;
			amountOnLevel = 0;

			return left;
		}

		if (amountOnLevel - amount < 0) {
			amount -= amountOnLevel;

			while (amount > 0) {
				float levelCapacity = getLevelCapacity(levels);
				if (levelCapacity > amount) {
					levels--;
					amountOnLevel = levelCapacity - amount;
					return 0;
				} else {
					amount -= levelCapacity;
					levels--;
				}
			}

			throw new IllegalStateException("This shouldn't be achieved, because if all levels' acapacity is smaller than removed amount, it should be cut in the start of the method");
		} else {
			amountOnLevel -= amount;
			return 0;
		}
	}

	@Override
	public float getLevelCapacity(int level) {
		return level >= 5 ? 50 : level >= 10 ? 70 : level >= 15 ? 90 : level >= 20 ? 110 : level >= 30 ? 130 : level >= 40 ? 150 : 30; //May need balancing
	}

	@Override
	public float getAmountOnCurrentLevel() {
		return amountOnLevel;
	}

	@Override
	public int getLevelCount() {
		return levels;
	}

	@Override
	public float getTotal() {
		float amount = 0;

		for (int i = 0; i < levels; i++) {
			amount += getLevelCapacity(levels);
		}

		return amount + amountOnLevel;
	}

	@Override
	public NBTTagCompound serializeNBT() {
		NBTTagCompound compound = new NBTTagCompound();
		compound.setFloat("amount_on_level", amountOnLevel);
		compound.setInteger("levels", levels);

		return compound;
	}

	@Override
	public void deserializeNBT(NBTTagCompound nbt) {
		amountOnLevel = nbt.getFloat("amount_on_level");
		levels = nbt.getInteger("levels");
	}

	@Override
	public void writeToBuffer(PacketBuffer buffer) {
		buffer.writeFloat(amountOnLevel);
		buffer.writeInt(levels);
	}

	@Override
	public void readFromBuffer(PacketBuffer buffer) {
		amountOnLevel = buffer.readFloat();
		levels = buffer.readInt();
	}
}