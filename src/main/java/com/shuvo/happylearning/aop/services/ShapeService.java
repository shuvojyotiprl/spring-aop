package com.shuvo.happylearning.aop.services;

import com.shuvo.happylearning.aop.model.Circle;
import com.shuvo.happylearning.aop.model.Tringle;

public class ShapeService {

	private Circle circle;
	private Tringle tringle;

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public Tringle getTringle() {
		return tringle;
	}

	public void setTringle(Tringle tringle) {
		this.tringle = tringle;
	}

}
