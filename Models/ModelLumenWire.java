/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2017
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 10/03/2016 9:30:44 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.ChromatiCraft.Models;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;

import Reika.ChromatiCraft.Base.ChromaModelBase;
import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.DragonAPI.Libraries.Rendering.ReikaRenderHelper;

public class ModelLumenWire extends ChromaModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape2;
	LODModelPart Shape3a;
	LODModelPart Shape3;
	LODModelPart Shape3b;
	LODModelPart Shape3c;
	LODModelPart Shape4;
	LODModelPart Shape4a;
	LODModelPart Shape4b;
	LODModelPart Shape4c;

	public ModelLumenWire()
	{
		textureWidth = 32;
		textureHeight = 32;

		Shape1 = new LODModelPart(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 6, 1, 6);
		Shape1.setRotationPoint(-3F, 23F, -3F);
		Shape1.setTextureSize(32, 32);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 0, 8);
		Shape2.addBox(0F, 0F, 0F, 3, 3, 3);
		Shape2.setRotationPoint(-1.5F, 20.9F, -1.5F);
		Shape2.setTextureSize(32, 32);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape3a = new LODModelPart(this, 0, 20);
		Shape3a.addBox(4F, 0.5F, -0.5F, 3, 1, 3);
		Shape3a.setRotationPoint(0F, 16.7F, -1F);
		Shape3a.setTextureSize(32, 32);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 1.064651F);
		Shape3 = new LODModelPart(this, 0, 25);
		Shape3.addBox(-0.5F, 0.5F, 4F, 3, 1, 3);
		Shape3.setRotationPoint(-1F, 16.7F, 0F);
		Shape3.setTextureSize(32, 32);
		Shape3.mirror = true;
		this.setRotation(Shape3, -1.064651F, 0F, 0F);
		Shape3b = new LODModelPart(this, 13, 11);
		Shape3b.addBox(-7F, 0.5F, -0.5F, 3, 1, 3);
		Shape3b.setRotationPoint(0F, 16.7F, -1F);
		Shape3b.setTextureSize(32, 32);
		Shape3b.mirror = true;
		this.setRotation(Shape3b, 0F, 0F, -1.064651F);
		Shape3c = new LODModelPart(this, 0, 15);
		Shape3c.addBox(-0.5F, 0.5F, -7F, 3, 1, 3);
		Shape3c.setRotationPoint(-1F, 16.7F, 0F);
		Shape3c.setTextureSize(32, 32);
		Shape3c.mirror = true;
		this.setRotation(Shape3c, 1.064651F, 0F, 0F);
		Shape4 = new LODModelPart(this, 13, 8);
		Shape4.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape4.setRotationPoint(-2.8F, 22.5F, -2.8F);
		Shape4.setTextureSize(32, 32);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape4a = new LODModelPart(this, 13, 8);
		Shape4a.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape4a.setRotationPoint(1.8F, 22.5F, 1.8F);
		Shape4a.setTextureSize(32, 32);
		Shape4a.mirror = true;
		this.setRotation(Shape4a, 0F, 0F, 0F);
		Shape4b = new LODModelPart(this, 13, 8);
		Shape4b.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape4b.setRotationPoint(1.8F, 22.5F, -2.8F);
		Shape4b.setTextureSize(32, 32);
		Shape4b.mirror = true;
		this.setRotation(Shape4b, 0F, 0F, 0F);
		Shape4c = new LODModelPart(this, 13, 8);
		Shape4c.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape4c.setRotationPoint(-2.8F, 22.5F, 1.8F);
		Shape4c.setTextureSize(32, 32);
		Shape4c.mirror = true;
		this.setRotation(Shape4c, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li) {
		Shape1.render(te, f5);
		Shape3a.render(te, f5);
		Shape3.render(te, f5);
		Shape3b.render(te, f5);
		Shape3c.render(te, f5);
		Shape4.render(te, f5);
		Shape4a.render(te, f5);
		Shape4b.render(te, f5);
		Shape4c.render(te, f5);

		ReikaRenderHelper.pushTESRLightingState();
		Shape2.render(te, f5);
		ReikaRenderHelper.popTESRLightingState();
	}

}
