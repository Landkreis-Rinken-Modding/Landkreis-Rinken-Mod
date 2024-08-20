package net.lkr.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelSchussichereWeste<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("landkreis_rinken", "model_schussichere_weste"), "main");
	public final ModelPart Body;
	public final ModelPart bone3;

	public ModelSchussichereWeste(ModelPart root) {
		this.Body = root.getChild("Body");
		this.bone3 = root.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 4).addBox(-4.0F, 4.0F, -2.2F, 8.0F, 5.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(14, 15).addBox(-3.25F, 3.0F, -2.2F, 6.5F, 1.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(-2.75F, 0.95F, -2.2F, 5.5F, 2.05F, 0.2F, new CubeDeformation(0.0F)).texOffs(7, 6).addBox(-4.2F, 4.0F, -2.0F, 0.2F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(5, 7)
						.addBox(4.0F, 4.0F, -2.0F, 0.2F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 12).addBox(-2.75F, -0.05F, -2.2F, 0.75F, 1.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(16, 10)
						.addBox(-2.75F, -0.05F, 2.0F, 0.75F, 1.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-2.75F, 0.95F, 2.0F, 5.5F, 2.05F, 0.2F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-3.25F, 3.0F, 2.0F, 6.5F, 1.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, 4.0F, 2.0F, 8.0F, 5.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(12, 4)
						.addBox(-2.75F, -0.2F, -2.05F, 0.75F, 0.2F, 4.1F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(12, 0).addBox(-2.75F, -0.25F, -2.1F, 0.75F, 0.2F, 4.25F, new CubeDeformation(0.0F)).texOffs(16, 11)
				.addBox(-2.75F, -0.05F, 2.0F, 0.75F, 1.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(12, 16).addBox(-2.75F, -0.05F, -2.2F, 0.75F, 1.0F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
