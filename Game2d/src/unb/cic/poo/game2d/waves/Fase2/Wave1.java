package unb.cic.poo.game2d.waves.Fase2;

import java.util.ArrayList;

import unb.cic.poo.game2d.GameActivity;
import unb.cic.poo.game2d.enemies.*;
import unb.cic.poo.game2d.waves.Wave;

public class Wave1 extends Wave{
	
	public Wave1(){
		super();
		this.enemies = new ArrayList<Enemy>();
		
		enemies.add(new VerticalMovementEnemy(GameActivity.CAMERA_WIDTH+400, (float)GameActivity.CAMERA_HEIGHT*0.3f, (float)GameActivity.CAMERA_WIDTH*0.3f, 0.5f));
		enemies.add(new VerticalMovementEnemy(GameActivity.CAMERA_WIDTH+400, (float)GameActivity.CAMERA_HEIGHT*0.5f, (float)GameActivity.CAMERA_WIDTH*0.5f, 0.9f));
		enemies.add(new VerticalMovementEnemy(GameActivity.CAMERA_WIDTH+400, (float)GameActivity.CAMERA_HEIGHT*0.7f, (float)GameActivity.CAMERA_WIDTH*0.7f, 0.1f));
		enemies.add(new VerticalMovementEnemy(GameActivity.CAMERA_WIDTH+400, (float)GameActivity.CAMERA_HEIGHT*0.9f, (float)GameActivity.CAMERA_WIDTH*0.9f, 0.3f));
		enemies.add(new CommonEnemy((float)GameActivity.CAMERA_WIDTH+50, GameActivity.CAMERA_HEIGHT*0.1f));
		enemies.add(new CommonEnemy((float)GameActivity.CAMERA_WIDTH+150, GameActivity.CAMERA_HEIGHT*0.5f));
		enemies.add(new CommonEnemy((float)GameActivity.CAMERA_WIDTH+80, GameActivity.CAMERA_HEIGHT*0.9f));
		
	}

}
