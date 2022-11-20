// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.util;

import java.util.HashMap;
import java.util.Map;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import android.util.Log;
import android.opengl.GLU;
import android.opengl.GLES20;

public final class GlUtil
{
    public static void a(final int n, int f, final String s) {
        final int glCreateShader = GLES20.glCreateShader(f);
        GLES20.glShaderSource(glCreateShader, s);
        GLES20.glCompileShader(glCreateShader);
        final int[] array = { 0 };
        GLES20.glGetShaderiv(glCreateShader, 35713, array, 0);
        if (array[0] != 1) {
            final String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
            f = wnj.f(glGetShaderInfoLog, 10);
            final StringBuilder sb = new StringBuilder(s.length() + f);
            sb.append(glGetShaderInfoLog);
            sb.append(", source: ");
            sb.append(s);
            d(sb.toString());
        }
        GLES20.glAttachShader(n, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        b();
    }
    
    public static void b() {
        int n = 0;
        while (true) {
            final int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            final String value = String.valueOf(GLU.gluErrorString(glGetError));
            String concat;
            if (value.length() != 0) {
                concat = "glError: ".concat(value);
            }
            else {
                concat = new String("glError: ");
            }
            Log.e("GlUtil", concat);
            n = glGetError;
        }
        if (n != 0) {
            final String value2 = String.valueOf(GLU.gluErrorString(n));
            String concat2;
            if (value2.length() != 0) {
                concat2 = "glError: ".concat(value2);
            }
            else {
                concat2 = new String("glError: ");
            }
            d(concat2);
        }
    }
    
    public static FloatBuffer c(final float[] array) {
        return (FloatBuffer)ByteBuffer.allocateDirect(array.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(array).flip();
    }
    
    public static void d(final String s) {
        Log.e("GlUtil", s);
    }
    
    public static final class GlException extends RuntimeException
    {
    }
    
    public static final class a
    {
        public a(final String s) {
        }
    }
    
    public static final class b
    {
        public final int a;
        public final a[] b;
        public final c[] c;
        public final Map<String, a> d;
        public final Map<String, c> e;
        
        public b() {
            final int glCreateProgram = GLES20.glCreateProgram();
            this.a = glCreateProgram;
            GlUtil.b();
            GlUtil.a(glCreateProgram, 35633, "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n");
            GlUtil.a(glCreateProgram, 35632, "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            GLES20.glLinkProgram(glCreateProgram);
            final int[] array = { 0 };
            GLES20.glGetProgramiv(glCreateProgram, 35714, array, 0);
            if (array[0] != 1) {
                final String value = String.valueOf(GLES20.glGetProgramInfoLog(glCreateProgram));
                String concat;
                if (value.length() != 0) {
                    concat = "Unable to link shader program: \n".concat(value);
                }
                else {
                    concat = new String("Unable to link shader program: \n");
                }
                GlUtil.d(concat);
            }
            GLES20.glUseProgram(glCreateProgram);
            this.d = new HashMap();
            final int[] array2 = { 0 };
            GLES20.glGetProgramiv(glCreateProgram, 35721, array2, 0);
            this.b = new a[array2[0]];
            int i = 0;
        Label_0150:
            while (i < array2[0]) {
                final int a = this.a;
                final int[] array3 = { 0 };
                GLES20.glGetProgramiv(a, 35722, array3, 0);
                final int n = array3[0];
                final byte[] array4 = new byte[n];
                GLES20.glGetActiveAttrib(a, i, array3[0], new int[1], 0, new int[1], 0, new int[1], 0, array4, 0);
                while (true) {
                    for (int j = 0; j < n; ++j) {
                        if (array4[j] == 0) {
                            final String s = new String(array4, 0, j);
                            GLES20.glGetAttribLocation(a, s);
                            final a a2 = new a(s);
                            this.b[i] = a2;
                            this.d.put(s, a2);
                            ++i;
                            continue Label_0150;
                        }
                    }
                    int j = n;
                    continue;
                }
            }
            this.e = new HashMap();
            final int[] array5 = { 0 };
            GLES20.glGetProgramiv(this.a, 35718, array5, 0);
            this.c = new c[array5[0]];
            int k = 0;
            Label_0352:
            while (k < array5[0]) {
                final int a3 = this.a;
                final int[] array6 = { 0 };
                GLES20.glGetProgramiv(a3, 35719, array6, 0);
                final int[] array7 = { 0 };
                final int n2 = array6[0];
                final byte[] array8 = new byte[n2];
                GLES20.glGetActiveUniform(a3, k, array6[0], new int[1], 0, new int[1], 0, array7, 0, array8, 0);
                while (true) {
                    for (int l = 0; l < n2; ++l) {
                        if (array8[l] == 0) {
                            final String s2 = new String(array8, 0, l);
                            GLES20.glGetUniformLocation(a3, s2);
                            final c c = new c(s2);
                            this.c[k] = c;
                            this.e.put(s2, c);
                            ++k;
                            continue Label_0352;
                        }
                    }
                    int l = n2;
                    continue;
                }
            }
            GlUtil.b();
        }
        
        public final int a(final String s) {
            return GLES20.glGetUniformLocation(this.a, s);
        }
    }
    
    public static final class c
    {
        public c(final String s) {
        }
    }
}
