// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament.utils;

import com.google.android.filament.Texture;
import com.google.android.filament.Skybox;
import com.google.android.filament.IndirectLight;
import java.nio.Buffer;
import com.google.android.filament.Engine;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nJ \u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nJ \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\bJ)\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0082 J)\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0082 J)\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0082 J!\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0010H\u0082 ¨\u0006\u001d" }, d2 = { "Lcom/google/android/filament/utils/KTXLoader;", "", "()V", "createIndirectLight", "Lcom/google/android/filament/IndirectLight;", "engine", "Lcom/google/android/filament/Engine;", "buffer", "Ljava/nio/Buffer;", "options", "Lcom/google/android/filament/utils/KTXLoader$Options;", "createSkybox", "Lcom/google/android/filament/Skybox;", "createTexture", "Lcom/google/android/filament/Texture;", "getSphericalHarmonics", "", "nCreateIndirectLight", "", "nativeEngine", "remaining", "", "srgb", "", "nCreateKTXTexture", "nCreateSkybox", "nGetSphericalHarmonics", "outSphericalHarmonics", "Options", "filament-utils-android_fullRelease" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public final class KTXLoader
{
    public static final KTXLoader INSTANCE;
    
    static {
        INSTANCE = new KTXLoader();
    }
    
    private KTXLoader() {
    }
    
    public static IndirectLight createIndirectLight$default(final KTXLoader ktxLoader, final Engine engine, final Buffer buffer, Options options, final int n, final Object o) {
        if ((n & 0x4) != 0x0) {
            options = new Options();
        }
        return ktxLoader.createIndirectLight(engine, buffer, options);
    }
    
    public static Skybox createSkybox$default(final KTXLoader ktxLoader, final Engine engine, final Buffer buffer, Options options, final int n, final Object o) {
        if ((n & 0x4) != 0x0) {
            options = new Options();
        }
        return ktxLoader.createSkybox(engine, buffer, options);
    }
    
    public static Texture createTexture$default(final KTXLoader ktxLoader, final Engine engine, final Buffer buffer, Options options, final int n, final Object o) {
        if ((n & 0x4) != 0x0) {
            options = new Options();
        }
        return ktxLoader.createTexture(engine, buffer, options);
    }
    
    private final native long nCreateIndirectLight(final long p0, final Buffer p1, final int p2, final boolean p3);
    
    private final native long nCreateKTXTexture(final long p0, final Buffer p1, final int p2, final boolean p3);
    
    private final native long nCreateSkybox(final long p0, final Buffer p1, final int p2, final boolean p3);
    
    private final native boolean nGetSphericalHarmonics(final Buffer p0, final int p1, final float[] p2);
    
    public final IndirectLight createIndirectLight(final Engine engine, final Buffer buffer, final Options options) {
        e0e.f((Object)engine, "engine");
        e0e.f((Object)buffer, "buffer");
        e0e.f((Object)options, "options");
        return new IndirectLight(this.nCreateIndirectLight(engine.getNativeObject(), buffer, buffer.remaining(), options.getSrgb()));
    }
    
    public final Skybox createSkybox(final Engine engine, final Buffer buffer, final Options options) {
        e0e.f((Object)engine, "engine");
        e0e.f((Object)buffer, "buffer");
        e0e.f((Object)options, "options");
        return new Skybox(this.nCreateSkybox(engine.getNativeObject(), buffer, buffer.remaining(), options.getSrgb()));
    }
    
    public final Texture createTexture(final Engine engine, final Buffer buffer, final Options options) {
        e0e.f((Object)engine, "engine");
        e0e.f((Object)buffer, "buffer");
        e0e.f((Object)options, "options");
        return new Texture(this.nCreateKTXTexture(engine.getNativeObject(), buffer, buffer.remaining(), options.getSrgb()));
    }
    
    public final float[] getSphericalHarmonics(final Buffer buffer) {
        e0e.f((Object)buffer, "buffer");
        final float[] array = new float[27];
        float[] array2;
        if (this.nGetSphericalHarmonics(buffer, buffer.remaining(), array)) {
            array2 = array;
        }
        else {
            array2 = null;
        }
        return array2;
    }
    
    @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t" }, d2 = { "Lcom/google/android/filament/utils/KTXLoader$Options;", "", "()V", "srgb", "", "getSrgb", "()Z", "setSrgb", "(Z)V", "filament-utils-android_fullRelease" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Options
    {
        private boolean srgb;
        
        public final boolean getSrgb() {
            return this.srgb;
        }
        
        public final void setSrgb(final boolean srgb) {
            this.srgb = srgb;
        }
    }
}
