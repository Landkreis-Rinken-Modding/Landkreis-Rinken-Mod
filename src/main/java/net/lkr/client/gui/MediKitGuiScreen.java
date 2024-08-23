package net.lkr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.lkr.world.inventory.MediKitGuiMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MediKitGuiScreen extends AbstractContainerScreen<MediKitGuiMenu> {
	private final static HashMap<String, Object> guistate = MediKitGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public MediKitGuiScreen(MediKitGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("landkreis_rinken:textures/screens/medi_kit_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.landkreis_rinken.medi_kit_gui.label_medikit"), 15, 7, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.landkreis_rinken.medi_kit_gui.label_trotz_nutzung_unseres_ersten_hil"), 62, 21, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.landkreis_rinken.medi_kit_gui.label_ersten_hilfe_koffers"), 62, 32, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.landkreis_rinken.medi_kit_gui.label_sind_wir_nicht"), 62, 43, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.landkreis_rinken.medi_kit_gui.label_verantwortlich_falls"), 62, 54, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.landkreis_rinken.medi_kit_gui.label_der_patient_verstirbt"), 62, 65, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
