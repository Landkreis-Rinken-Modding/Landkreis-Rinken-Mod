package net.lkr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.lkr.world.inventory.CreatePassortMenu;
import net.lkr.network.CreatePassortButtonMessage;
import net.lkr.LandkreisRinkenMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CreatePassortScreen extends AbstractContainerScreen<CreatePassortMenu> {
	private final static HashMap<String, Object> guistate = CreatePassortMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox name;
	EditBox item;
	EditBox special;
	EditBox birth;
	Button button_erstellen;

	public CreatePassortScreen(CreatePassortMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 400;
		this.imageHeight = 245;
	}

	private static final ResourceLocation texture = new ResourceLocation("landkreis_rinken:textures/screens/create_passort.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		name.render(guiGraphics, mouseX, mouseY, partialTicks);
		item.render(guiGraphics, mouseX, mouseY, partialTicks);
		special.render(guiGraphics, mouseX, mouseY, partialTicks);
		birth.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 18 && mouseX < leftPos + 42 && mouseY > topPos + 215 && mouseY < topPos + 239)
			guiGraphics.renderTooltip(font, Component.translatable("gui.landkreis_rinken.create_passort.tooltip_pass"), mouseX, mouseY);
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
		if (name.isFocused())
			return name.keyPressed(key, b, c);
		if (item.isFocused())
			return item.keyPressed(key, b, c);
		if (special.isFocused())
			return special.keyPressed(key, b, c);
		if (birth.isFocused())
			return birth.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		name.tick();
		item.tick();
		special.tick();
		birth.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String nameValue = name.getValue();
		String itemValue = item.getValue();
		String specialValue = special.getValue();
		String birthValue = birth.getValue();
		super.resize(minecraft, width, height);
		name.setValue(nameValue);
		item.setValue(itemValue);
		special.setValue(specialValue);
		birth.setValue(birthValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.landkreis_rinken.create_passort.label_passport_creator"), 10, 10, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		name = new EditBox(this.font, this.leftPos + 11, this.topPos + 83, 118, 18, Component.translatable("gui.landkreis_rinken.create_passort.name")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.landkreis_rinken.create_passort.name").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.landkreis_rinken.create_passort.name").getString());
				else
					setSuggestion(null);
			}
		};
		name.setSuggestion(Component.translatable("gui.landkreis_rinken.create_passort.name").getString());
		name.setMaxLength(32767);
		guistate.put("text:name", name);
		this.addWidget(this.name);
		item = new EditBox(this.font, this.leftPos + 11, this.topPos + 29, 118, 18, Component.translatable("gui.landkreis_rinken.create_passort.item")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.landkreis_rinken.create_passort.item").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.landkreis_rinken.create_passort.item").getString());
				else
					setSuggestion(null);
			}
		};
		item.setSuggestion(Component.translatable("gui.landkreis_rinken.create_passort.item").getString());
		item.setMaxLength(32767);
		guistate.put("text:item", item);
		this.addWidget(this.item);
		special = new EditBox(this.font, this.leftPos + 11, this.topPos + 56, 118, 18, Component.translatable("gui.landkreis_rinken.create_passort.special")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.landkreis_rinken.create_passort.special").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.landkreis_rinken.create_passort.special").getString());
				else
					setSuggestion(null);
			}
		};
		special.setSuggestion(Component.translatable("gui.landkreis_rinken.create_passort.special").getString());
		special.setMaxLength(32767);
		guistate.put("text:special", special);
		this.addWidget(this.special);
		birth = new EditBox(this.font, this.leftPos + 11, this.topPos + 110, 118, 18, Component.translatable("gui.landkreis_rinken.create_passort.birth")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.landkreis_rinken.create_passort.birth").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.landkreis_rinken.create_passort.birth").getString());
				else
					setSuggestion(null);
			}
		};
		birth.setSuggestion(Component.translatable("gui.landkreis_rinken.create_passort.birth").getString());
		birth.setMaxLength(32767);
		guistate.put("text:birth", birth);
		this.addWidget(this.birth);
		button_erstellen = Button.builder(Component.translatable("gui.landkreis_rinken.create_passort.button_erstellen"), e -> {
			if (true) {
				LandkreisRinkenMod.PACKET_HANDLER.sendToServer(new CreatePassortButtonMessage(0, x, y, z));
				CreatePassortButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 44, this.topPos + 221, 72, 20).build();
		guistate.put("button:button_erstellen", button_erstellen);
		this.addRenderableWidget(button_erstellen);
	}
}
