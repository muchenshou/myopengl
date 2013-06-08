package com.example.myopengl;

import javax.microedition.khronos.opengles.GL10;

public class Mesh {
	private Square square = new Square();
	private float angle = 0;
	public void onDrawFrame(GL10 gl) {
		gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);
		gl.glLoadIdentity();
		
		gl.glTranslatef(0f, 0f, -10f);
		gl.glPushMatrix();
		gl.glRotatef(-angle, 0f, 0f, 1f);
		square.onDrawFrame(gl);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		gl.glRotatef(-angle, 0f, 0f, -1f);
		gl.glTranslatef(-2, 0, 0);
		gl.glScalef(.5f, .5f, .5f);
		square.onDrawFrame(gl);
		
		gl.glRotatef(-angle, 0f,0f,-1f);
		gl.glTranslatef(-2f, 0f, 0f);
		gl.glScalef(.5f, .5f, .5f);
		square.onDrawFrame(gl);
		
		gl.glPopMatrix();
		gl.glPopMatrix();
		
		angle++;
	}
}
