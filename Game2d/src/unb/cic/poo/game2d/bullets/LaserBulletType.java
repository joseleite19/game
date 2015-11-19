package unb.cic.poo.game2d.bullets;

import unb.cic.poo.game2d.GameManager;
import unb.cic.poo.game2d.scenes.SceneManager;

public class LaserBulletType extends BulletType{
	private static final float COOLDOWN_TIME = 1f;
	public LaserBulletType() {
		this.cooldown = COOLDOWN_TIME;
		this.onCooldown = false;
	}
	
	@Override
	public void setBullet(float pX, float pY, boolean isEnemy) {
		SceneManager.getInstance().getCurrentScene().registerUpdateHandler(new CooldownHandler(this));
		LaserBullet bullet = new LaserBullet(pX, pY, isEnemy);
		GameManager.getInstance().getGameScene().attachChild(bullet);
	}

}