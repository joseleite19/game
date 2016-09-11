package unb.cic.poo.game2d.waves;

import java.util.ArrayList;

import unb.cic.poo.game2d.enemies.*;
import unb.cic.poo.game2d.items.FlameThrowerGen;
import unb.cic.poo.game2d.GameActivity;
import unb.cic.poo.game2d.waves.Wave;

public class Wave1 extends Wave {
	
	double separacao = 0.0;
	double espacoEntreLinhas = 0;
	double espacoInicial = 100;
	
	/*Wave de CommonEnemy*/
	public Wave1(){
		super();
		this.enemies = new ArrayList<Enemy>();
        
        for(int j=0; j<7; j++){
            for(int i=0; i<39; i++){
                this.enemies.add(new CommonEnemy((float)(GameActivity.CAMERA_WIDTH+espacoEntreLinhas+espacoInicial), (float) (GameActivity.CAMERA_HEIGHT*separacao)));
                
                aumentaSeparacao();
            }
            
            aumentaEspacoEntreLinhas();
            resetSeparacao();
        }
        
		this.enemies.add(new CommonEnemy(GameActivity.CAMERA_WIDTH+200, (float) (GameActivity.CAMERA_HEIGHT*0.8)));
		//this.enemies.add(new FreezedShootingEnemy(GameActivity.CAMERA_WIDTH+200,(float) (GameActivity.CAMERA_HEIGHT*0.2), GameActivity.CAMERA_WIDTH*0.9f));
		this.enemies.add(new CommonEnemy(GameActivity.CAMERA_WIDTH+200, (float) (GameActivity.CAMERA_HEIGHT*0.2)));
		this.enemies.add(new ConstantXLaser(GameActivity.CAMERA_WIDTH*0.9f, -100.0f, ConstantXLaser.goUpOrDown.goDown, 1/3f, new FlameThrowerGen()));
	}
	
	private void resetSeparacao() {
		this.separacao = 0.0;
		
	}

	public void aumentaSeparacao(){
		this.separacao += 0.05;
	}
	
	public void aumentaEspacoEntreLinhas(){
		this.espacoEntreLinhas += 50;
	}
}
