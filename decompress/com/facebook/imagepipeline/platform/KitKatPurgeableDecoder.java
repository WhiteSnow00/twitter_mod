// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.imagepipeline.platform;

import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory$Options;
import com.facebook.common.memory.PooledByteBuffer;
import android.annotation.TargetApi;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;

@TargetApi(19)
@x49
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder
{
    public final q6b c;
    
    @x49
    public KitKatPurgeableDecoder(final q6b c) {
        this.c = c;
    }
    
    public final Bitmap c(wi4<PooledByteBuffer> a, final BitmapFactory$Options bitmapFactory$Options) {
        final PooledByteBuffer pooledByteBuffer = (PooledByteBuffer)a.h();
        final int size = pooledByteBuffer.size();
        a = this.c.a(size);
        try {
            final byte[] array = (byte[])a.h();
            pooledByteBuffer.C(0, array, 0, size);
            final Bitmap decodeByteArray = BitmapFactory.decodeByteArray(array, 0, size, bitmapFactory$Options);
            ri4.s((Object)decodeByteArray, (Object)"BitmapFactory returned null");
            return decodeByteArray;
        }
        finally {
            wi4.e(a);
        }
    }
    
    public final Bitmap d(wi4<PooledByteBuffer> a, final int n, final BitmapFactory$Options bitmapFactory$Options) {
        byte[] b;
        if (DalvikPurgeableDecoder.e(a, n)) {
            b = null;
        }
        else {
            b = DalvikPurgeableDecoder.b;
        }
        final PooledByteBuffer pooledByteBuffer = (PooledByteBuffer)a.h();
        ri4.j(Boolean.valueOf(n <= pooledByteBuffer.size()));
        final q6b c = this.c;
        final int n2 = n + 2;
        a = c.a(n2);
        try {
            final byte[] array = (byte[])a.h();
            pooledByteBuffer.C(0, array, 0, n);
            int n3 = n;
            if (b != null) {
                array[n] = -1;
                array[n + 1] = -39;
                n3 = n2;
            }
            final Bitmap decodeByteArray = BitmapFactory.decodeByteArray(array, 0, n3, bitmapFactory$Options);
            ri4.s((Object)decodeByteArray, (Object)"BitmapFactory returned null");
            return decodeByteArray;
        }
        finally {
            wi4.e(a);
        }
    }
}
