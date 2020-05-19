package State;

import java.awt.Graphics;

import Entity.Player;

import Main.Game;
import Main.Handler;
import gfx.Assets;
import world.World;

public class GameState extends State{
	
	private World world;
	private World world2;
	
	public GameState(Handler handler, String path) {
		super(handler);
		
		//world = new World(handler, "res/world/world1.wind.txt");
		
		world = new World(handler, path);
		
		handler.setWorld(world);
	}

	@Override
	public void tick() {
		world.tick();
		
	}

	@Override
	public void render(Graphics g) {
		world.render(g);

	}

}
