package application.vue;

import java.util.HashMap;
import java.util.Map;

import javafx.scene.image.Image;

public class ImageMap {
	public final static Map<String, Image> images = new HashMap<>();

	public ImageMap() {
		this.initImagesEpee();
		this.initImagesPioche();
		this.initImagesArc();
		this.initImagesHache();
		this.initImagesBloc();
		this.initImagesMobs();
//		this.initImagesArbre();
	}

	public void initImagesPioche() {
		for (int i = 0; i < 2; i++) {
			images.put("P" + i, new Image("application/ressource/inventaire/pioche/P" + i + ".png"));
		}
	}

	public void initImagesEpee() {
		for (int i = 0; i < 2; i++) {
			images.put("E" + i, new Image("application/ressource/inventaire/epee/E" + i + ".png"));
		}
	}

	public void initImagesArc() {
		for (int i = 0; i < 2; i++) {
			images.put("A" + i, new Image("application/ressource/inventaire/arc/A" + i + ".png"));
		}
	}

	public void initImagesHache() {
		for (int i = 0; i < 2; i++) {
			images.put("H" + i, new Image("application/ressource/inventaire/hache/H" + i + ".png"));
		}
	}

	public void initImagesBloc() {
		for (int i = 0; i < 8; i++) {
			images.put("B" + i, new Image("application/ressource/tiles/" + i + ".png"));
		}
	}
	

//	public void initImagesArbre() {
//		for (int i = 1; i < 6; i++) {
//			images.put("ARB" + i, new Image("application/ressource/arbres/arbre" + i + ".png"));
//		}
//	}
	
	public void initImagesMobs() {
		images.put("slime", new Image("application/ressource/slime.png"));
		images.put("fleche", new Image("application/ressource/Fleche.png"));

	}
}