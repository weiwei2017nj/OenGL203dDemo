package com.hon.oengl203ddemo.model;

/**
 * Created by Frank_Hon on 2017/4/23.
 * e-mail:frank_hon@foxmail.com
 */

public interface Object3D {
    // number of coordinates per vertex in this array
    int COORDS_PER_VERTEX = 3;
    int VERTEX_STRIDE = COORDS_PER_VERTEX * 4; // 4 bytes per

    float[] DEFAULT_COLOR = { 1.0f, 0.0f, 0, 1.0f };

    void draw(Object3DData obj, float[] pMatrix, float[] vMatrix, int textureId, float[] lightPosInEyeSpace);

    void draw(Object3DData obj, float[] pMatrix, float[] vMatrix, int drawType, int drawSize, int textureId, float[] lightPosInEyeSpace);
}