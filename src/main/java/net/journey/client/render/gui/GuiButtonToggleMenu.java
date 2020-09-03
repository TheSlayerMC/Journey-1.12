package net.journey.client.render.gui;

import net.journey.util.Config;
import net.journey.util.ManagedProperty.BooleanManagedProperty;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.text.TextFormatting;

public class GuiButtonToggleMenu extends GuiButton {

	public GuiButtonToggleMenu(int x, int y) {
		super(137, x, y, 20, 20, "");
	}

	@Override
	public void drawButton(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
		super.drawButton(mc, mouseX, mouseY, partialTicks);
		if (this.visible) {
			mc.getTextureManager().bindTexture(GuiJourneyButton.GOLD_BUTTON_TEXTURES);
			GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
			boolean flag =
					mouseX >= this.x &&
							mouseY >= this.y &&
							mouseX < this.x + this.width &&
							mouseY < this.y + this.height;
			int i = 146;

			if (flag) {
				i += this.height;
			}

			this.drawTexturedModalRect(this.x, this.y, 0, i, this.width, this.height);

			if (this.hovered) {
				BooleanManagedProperty propChangeMenu = Config.changeMainMenu;
				boolean changeMainMenu = propChangeMenu.get();

				String textKey = changeMainMenu ? "journey.menu.theme.mc" : "journey.menu.theme.jitl";
				renderTextOverlay(mc, mouseX, mouseY, textKey);
			}
		}
	}

	private void renderTextOverlay(Minecraft mc, int mouseX, int mouseY, String theme) {
		this.drawCenteredString(mc.fontRenderer, TextFormatting.BOLD + I18n.format(theme), mouseX + 64, mouseY + 8, 16777215);
	}

	@Override
	public void mouseReleased(int mouseX, int mouseY) {
		BooleanManagedProperty propChangeMenu = Config.changeMainMenu;
		Boolean changeMainMenu = propChangeMenu.get();

		propChangeMenu.set(!changeMainMenu);

		if (changeMainMenu) {
			Minecraft.getMinecraft().displayGuiScreen(new GuiMainMenu());
		} else {
			Minecraft.getMinecraft().displayGuiScreen(new JourneyMainMenu());
		}
	}
}
