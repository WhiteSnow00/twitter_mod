// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

public class RenderTarget
{
    private static final int ATTACHMENT_COUNT;
    private static final Texture.CubemapFace[] sCubemapFaceValues;
    private long mNativeObject;
    private final Texture[] mTextures;
    
    static {
        ATTACHMENT_COUNT = AttachmentPoint.values().length;
        sCubemapFaceValues = Texture.CubemapFace.values();
    }
    
    private RenderTarget(final long mNativeObject, final Builder builder) {
        final int attachment_COUNT = RenderTarget.ATTACHMENT_COUNT;
        final Texture[] mTextures = new Texture[attachment_COUNT];
        this.mTextures = mTextures;
        this.mNativeObject = mNativeObject;
        System.arraycopy(Builder.access$000(builder), 0, mTextures, 0, attachment_COUNT);
    }
    
    public static /* synthetic */ int access$100() {
        return RenderTarget.ATTACHMENT_COUNT;
    }
    
    private static native long nBuilderBuild(final long p0, final long p1);
    
    private static native void nBuilderFace(final long p0, final int p1, final int p2);
    
    private static native void nBuilderLayer(final long p0, final int p1, final int p2);
    
    private static native void nBuilderMipLevel(final long p0, final int p1, final int p2);
    
    private static native void nBuilderTexture(final long p0, final int p1, final long p2);
    
    private static native long nCreateBuilder();
    
    private static native void nDestroyBuilder(final long p0);
    
    private static native int nGetFace(final long p0, final int p1);
    
    private static native int nGetLayer(final long p0, final int p1);
    
    private static native int nGetMipLevel(final long p0, final int p1);
    
    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }
    
    public Texture.CubemapFace getFace(final AttachmentPoint attachmentPoint) {
        return RenderTarget.sCubemapFaceValues[nGetFace(this.getNativeObject(), attachmentPoint.ordinal())];
    }
    
    public int getLayer(final AttachmentPoint attachmentPoint) {
        return nGetLayer(this.getNativeObject(), attachmentPoint.ordinal());
    }
    
    public int getMipLevel(final AttachmentPoint attachmentPoint) {
        return nGetMipLevel(this.getNativeObject(), attachmentPoint.ordinal());
    }
    
    public long getNativeObject() {
        final long mNativeObject = this.mNativeObject;
        if (mNativeObject != 0L) {
            return mNativeObject;
        }
        throw new IllegalStateException("Calling method on destroyed RenderTarget");
    }
    
    public Texture getTexture(final AttachmentPoint attachmentPoint) {
        return this.mTextures[attachmentPoint.ordinal()];
    }
    
    public enum AttachmentPoint
    {
        COLOR, 
        COLOR1, 
        COLOR2, 
        COLOR3, 
        COLOR4, 
        COLOR5, 
        COLOR6, 
        COLOR7, 
        DEPTH;
    }
    
    public static class Builder
    {
        private final BuilderFinalizer mFinalizer;
        private final long mNativeBuilder;
        private final Texture[] mTextures;
        
        public Builder() {
            this.mTextures = new Texture[RenderTarget.access$100()];
            final long access$200 = nCreateBuilder();
            this.mNativeBuilder = access$200;
            this.mFinalizer = new BuilderFinalizer(access$200);
        }
        
        public static /* synthetic */ Texture[] access$000(final Builder builder) {
            return builder.mTextures;
        }
        
        public RenderTarget build(final Engine engine) {
            final long access$700 = nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (access$700 != 0L) {
                return new RenderTarget(access$700, this, null);
            }
            throw new IllegalStateException("Couldn't create RenderTarget");
        }
        
        public Builder face(final AttachmentPoint attachmentPoint, final Texture.CubemapFace cubemapFace) {
            nBuilderFace(this.mNativeBuilder, attachmentPoint.ordinal(), cubemapFace.ordinal());
            return this;
        }
        
        public Builder layer(final AttachmentPoint attachmentPoint, final int n) {
            nBuilderLayer(this.mNativeBuilder, attachmentPoint.ordinal(), n);
            return this;
        }
        
        public Builder mipLevel(final AttachmentPoint attachmentPoint, final int n) {
            nBuilderMipLevel(this.mNativeBuilder, attachmentPoint.ordinal(), n);
            return this;
        }
        
        public Builder texture(final AttachmentPoint attachmentPoint, final Texture texture) {
            this.mTextures[attachmentPoint.ordinal()] = texture;
            final long mNativeBuilder = this.mNativeBuilder;
            final int ordinal = attachmentPoint.ordinal();
            long nativeObject;
            if (texture != null) {
                nativeObject = texture.getNativeObject();
            }
            else {
                nativeObject = 0L;
            }
            nBuilderTexture(mNativeBuilder, ordinal, nativeObject);
            return this;
        }
        
        public static class BuilderFinalizer
        {
            private final long mNativeObject;
            
            public BuilderFinalizer(final long mNativeObject) {
                this.mNativeObject = mNativeObject;
            }
            
            public void finalize() {
                while (true) {
                    try {
                        super.finalize();
                        nDestroyBuilder(this.mNativeObject);
                    }
                    finally {
                        continue;
                    }
                    break;
                }
            }
        }
    }
}
