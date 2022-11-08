// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

import java.nio.Buffer;

public class SurfaceOrientation
{
    private long mNativeObject;
    
    private SurfaceOrientation(final long mNativeObject) {
        this.mNativeObject = mNativeObject;
    }
    
    private static native long nBuilderBuild(final long p0);
    
    private static native void nBuilderNormals(final long p0, final Buffer p1, final int p2, final int p3);
    
    private static native void nBuilderPositions(final long p0, final Buffer p1, final int p2, final int p3);
    
    private static native void nBuilderTangents(final long p0, final Buffer p1, final int p2, final int p3);
    
    private static native void nBuilderTriangleCount(final long p0, final int p1);
    
    private static native void nBuilderTriangles16(final long p0, final Buffer p1, final int p2);
    
    private static native void nBuilderTriangles32(final long p0, final Buffer p1, final int p2);
    
    private static native void nBuilderUVs(final long p0, final Buffer p1, final int p2, final int p3);
    
    private static native void nBuilderVertexCount(final long p0, final int p1);
    
    private static native long nCreateBuilder();
    
    private static native void nDestroy(final long p0);
    
    private static native void nDestroyBuilder(final long p0);
    
    private static native void nGetQuatsAsFloat(final long p0, final Buffer p1, final int p2);
    
    private static native void nGetQuatsAsHalf(final long p0, final Buffer p1, final int p2);
    
    private static native void nGetQuatsAsShort(final long p0, final Buffer p1, final int p2);
    
    private static native int nGetVertexCount(final long p0);
    
    public void destroy() {
        nDestroy(this.mNativeObject);
        this.mNativeObject = 0L;
    }
    
    public long getNativeObject() {
        final long mNativeObject = this.mNativeObject;
        if (mNativeObject != 0L) {
            return mNativeObject;
        }
        throw new IllegalStateException("Calling method on destroyed SurfaceOrientation");
    }
    
    public void getQuatsAsFloat(final Buffer buffer) {
        nGetQuatsAsFloat(this.mNativeObject, buffer, buffer.remaining());
    }
    
    public void getQuatsAsHalf(final Buffer buffer) {
        nGetQuatsAsHalf(this.mNativeObject, buffer, buffer.remaining());
    }
    
    public void getQuatsAsShort(final Buffer buffer) {
        nGetQuatsAsShort(this.mNativeObject, buffer, buffer.remaining());
    }
    
    public int getVertexCount() {
        return nGetVertexCount(this.mNativeObject);
    }
    
    public static class Builder
    {
        private Buffer mNormals;
        private int mNormalsStride;
        private Buffer mPositions;
        private int mPositionsStride;
        private Buffer mTangents;
        private int mTangentsStride;
        private Buffer mTexCoords;
        private int mTexCoordsStride;
        private int mTriangleCount;
        private Buffer mTrianglesUint16;
        private Buffer mTrianglesUint32;
        private int mVertexCount;
        
        public SurfaceOrientation build() {
            final long access$000 = nCreateBuilder();
            nBuilderVertexCount(access$000, this.mVertexCount);
            nBuilderTriangleCount(access$000, this.mTriangleCount);
            final Buffer mNormals = this.mNormals;
            if (mNormals != null) {
                nBuilderNormals(access$000, mNormals, mNormals.remaining(), this.mNormalsStride);
            }
            final Buffer mTangents = this.mTangents;
            if (mTangents != null) {
                nBuilderTangents(access$000, mTangents, mTangents.remaining(), this.mTangentsStride);
            }
            final Buffer mTexCoords = this.mTexCoords;
            if (mTexCoords != null) {
                nBuilderUVs(access$000, mTexCoords, mTexCoords.remaining(), this.mTexCoordsStride);
            }
            final Buffer mPositions = this.mPositions;
            if (mPositions != null) {
                nBuilderPositions(access$000, mPositions, mPositions.remaining(), this.mPositionsStride);
            }
            final Buffer mTrianglesUint16 = this.mTrianglesUint16;
            if (mTrianglesUint16 != null) {
                nBuilderTriangles16(access$000, mTrianglesUint16, mTrianglesUint16.remaining());
            }
            final Buffer mTrianglesUint17 = this.mTrianglesUint32;
            if (mTrianglesUint17 != null) {
                nBuilderTriangles32(access$000, mTrianglesUint17, mTrianglesUint17.remaining());
            }
            final long access$2 = nBuilderBuild(access$000);
            nDestroyBuilder(access$000);
            if (access$2 != 0L) {
                return new SurfaceOrientation(access$2, null);
            }
            throw new IllegalStateException("Could not create SurfaceOrientation");
        }
        
        public Builder normals(final Buffer mNormals) {
            this.mNormals = mNormals;
            this.mNormalsStride = 0;
            return this;
        }
        
        public Builder positions(final Buffer mPositions) {
            this.mPositions = mPositions;
            this.mPositionsStride = 0;
            return this;
        }
        
        public Builder tangents(final Buffer mTangents) {
            this.mTangents = mTangents;
            this.mTangentsStride = 0;
            return this;
        }
        
        public Builder triangleCount(final int mTriangleCount) {
            this.mTriangleCount = mTriangleCount;
            return this;
        }
        
        public Builder triangles_uint16(final Buffer mTrianglesUint16) {
            this.mTrianglesUint16 = mTrianglesUint16;
            return this;
        }
        
        public Builder triangles_uint32(final Buffer mTrianglesUint32) {
            this.mTrianglesUint32 = mTrianglesUint32;
            return this;
        }
        
        public Builder uvs(final Buffer mTexCoords) {
            this.mTexCoords = mTexCoords;
            this.mTexCoordsStride = 0;
            return this;
        }
        
        public Builder vertexCount(final int mVertexCount) {
            this.mVertexCount = mVertexCount;
            return this;
        }
    }
}
