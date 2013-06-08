package com.example.myopengl;

import java.nio.FloatBuffer;

import javax.microedition.khronos.opengles.GL10;

public class MeshWithColor extends Mesh{
	private float colors[] =  {
			1.0f,0.0f,0.0f,1.0f,
			0.0f,1.0f,0.0f,1.0f,
			0.0f,0.0f,1.0f,1.0f,
			1.0f,0.0f,1.0f,1.0f,
	};
	private FloatBuffer vertexBuffer;
	public MeshWithColor(){
		
	}
	@Override
	public void onDrawFrame(GL10 gl) {
		// TODO Auto-generated method stub
//		gl.glEnable(cap)
		super.onDrawFrame(gl);
	}

}
