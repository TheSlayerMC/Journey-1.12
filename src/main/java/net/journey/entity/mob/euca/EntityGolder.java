package net.journey.entity.mob.euca;

import net.journey.entity.MobStats;
import net.journey.entity.base.EntityAttributesHelper;
import net.journey.entity.base.JEntityMob;
import net.journey.init.JourneyLootTables;
import net.journey.init.JourneySounds;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityGolder extends JEntityMob {


    public EntityGolder(World par1World) {
        super(par1World);
        addMeleeAttackingAI();
        setSize(1.2F, 1.7F);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();

        EntityAttributesHelper.setMaxHealth(this, MobStats.GOLDER_HEALTH);
        EntityAttributesHelper.setAttackDamage(this, MobStats.GOLDER_DAMAGE);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return JourneySounds.REAPER;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource d) {
        return JourneySounds.REAPER_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return JourneySounds.REAPER_HURT;
    }

    @Override
    protected void entityInit() {
        super.entityInit();
    }

	@Override
	public ResourceLocation getLootTable() {
		return JourneyLootTables.GOLDER;
	}
}