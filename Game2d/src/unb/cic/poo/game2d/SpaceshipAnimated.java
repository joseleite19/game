package unb.cic.poo.game2d;

import org.andengine.entity.sprite.AnimatedSprite;
import org.andengine.input.touch.TouchEvent;

//Essa clase servira como base para o player e para os inimigos.

import org.andengine.opengl.texture.region.ITiledTextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

// Futuramente todas as naves serao animadas. Mantive a classe Spaceship igual, pois ainda estamos usando algumas estaticas.
public abstract class SpaceshipAnimated extends AnimatedSprite{
	protected int life;
	protected int speed;
	
	public SpaceshipAnimated(float pX, float pY,  ITiledTextureRegion pTextureRegion,
			VertexBufferObjectManager pVertexBufferObjectManager) {
		super(pX, pY, pTextureRegion, pVertexBufferObjectManager);
		//animEnemy = new AnimatedSprite(pX, pY, ResourceManager.enemyTextureRegion, this.getVertexBufferObjectManager());
		this.animate(150);
	}
	
	//Getters e Setters
	
	public int getLife() {
		return life;
	}


	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public void decrementLife(int decrement) {
		this.life -= decrement;
	}
	
	public void incrementLife(int increment){
		this.life += increment;
	}
	
	//O metodo de atirar deve ser sobrescrito nas subclasses, pois cada inimigo pode utilizar uma forma de atirar diferente.
	public abstract void shoot();

	/**
	 * @param pSceneTouchEvent
	 * Recebe um touch event para atualizar atributos da entidade baseado no toque da tela
	 */
	public abstract void handleTouchEvent(TouchEvent pSceneTouchEvent);
	

}
