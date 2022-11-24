// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament.utils;

import com.google.android.filament.Texture$InternalFormat;
import com.google.android.filament.Texture;
import java.nio.Buffer;
import com.google.android.filament.Engine;
import kotlin.Metadata;

@Metadata(d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nJ)\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082 ¨\u0006\u0012" }, d2 = { "Lcom/google/android/filament/utils/HDRLoader;", "", "()V", "createTexture", "Lcom/google/android/filament/Texture;", "engine", "Lcom/google/android/filament/Engine;", "buffer", "Ljava/nio/Buffer;", "options", "Lcom/google/android/filament/utils/HDRLoader$Options;", "nCreateHDRTexture", "", "nativeEngine", "remaining", "", "format", "Options", "filament-utils-android_fullRelease" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public final class HDRLoader
{
    public static final HDRLoader INSTANCE;
    
    static {
        INSTANCE = new HDRLoader();
    }
    
    private HDRLoader() {
    }
    
    public static Texture createTexture$default(final HDRLoader hdrLoader, final Engine engine, final Buffer buffer, Options options, final int n, final Object o) {
        if ((n & 0x4) != 0x0) {
            options = new Options();
        }
        return hdrLoader.createTexture(engine, buffer, options);
    }
    
    private final native long nCreateHDRTexture(final long p0, final Buffer p1, final int p2, final int p3);
    
    public final Texture createTexture(final Engine engine, final Buffer buffer, final Options options) {
        e0e.f((Object)engine, "engine");
        e0e.f((Object)buffer, "buffer");
        e0e.f((Object)options, "options");
        final long nCreateHDRTexture = this.nCreateHDRTexture(engine.getNativeObject(), buffer, buffer.remaining(), ((Enum)options.getDesiredFormat()).ordinal());
        if (nCreateHDRTexture == 0L) {
            return null;
        }
        return new Texture(nCreateHDRTexture);
    }
    
    @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t" }, d2 = { "Lcom/google/android/filament/utils/HDRLoader$Options;", "", "()V", "desiredFormat", "Lcom/google/android/filament/Texture$InternalFormat;", "getDesiredFormat", "()Lcom/google/android/filament/Texture$InternalFormat;", "setDesiredFormat", "(Lcom/google/android/filament/Texture$InternalFormat;)V", "filament-utils-android_fullRelease" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Options
    {
        private Texture$InternalFormat desiredFormat;
        
        public Options() {
            this.desiredFormat = Texture$InternalFormat.RGB16F;
        }
        
        public final Texture$InternalFormat getDesiredFormat() {
            return this.desiredFormat;
        }
        
        public final void setDesiredFormat(final Texture$InternalFormat desiredFormat) {
            e0e.f((Object)desiredFormat, "<set-?>");
            this.desiredFormat = desiredFormat;
        }
    }
}
