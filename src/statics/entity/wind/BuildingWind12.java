package statics.entity.wind;

import java.awt.Graphics;

import Entity.StaticEntity;
import Main.Handler;
import gfx.Assets;

public class BuildingWind12 extends StaticEntity{
	public BuildingWind12(Handler handler, float x, float y) {
		super(handler, x, y, 105, 200);
		
		bounds.x = 13;
		bounds.y = 140;
		bounds.width = 94;
		bounds.height = 60;
	}
	
	@Override
	public void tick() {
		
	}
	
	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.buildingWind[12], (int)(x - handler.getGameCamera().getxOffset()), 
				(int)(y - handler.getGameCamera().getyOffset()), width, height, null);
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}
}