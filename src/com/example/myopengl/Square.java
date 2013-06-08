package com.example.myopengl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

import javax.microedition.khronos.opengles.GL10;

public class Square {
	private float vertices[] = new float[] { 
			-1.0f, 1.0f, 0.0f,
			-1.0f, -1.0f, 0.0f, 
			1.0f, -1.0f, 0.0f,
			1.0f, 1.0f, 0.0f };
	private short indices[] = new short[] {
			0,1,2,0,2,3
	};
	private FloatBuffer vertexBuffer;
	private ShortBuffer indexBuffer;
	public Square(){
		vertexBuffer = Utils.toFloatBuffer(vertices);
		
		indexBuffer = Utils.toShortBuffer(indices);
	}
	
	public void onDrawFrame(GL10 gl) {
		gl.glFrontFace(GL10.GL_CCW);
		gl.glEnable(GL10.GL_CULL_FACE);
		gl.glCullFace(GL10.GL_BACK);
		
		gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
		gl.glVertexPointer(3, GL10.GL_FLOAT, 0, vertexBuffer);
		gl.glDrawElements(GL10.GL_TRIANGLES, indices.length, GL10.GL_UNSIGNED_SHORT, indexBuffer);
		gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
		gl.glDisable(GL10.GL_CULL_FACE);
	}
}
