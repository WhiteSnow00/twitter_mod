// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.a;
import android.content.ContentResolver;
import java.util.concurrent.Executor;

public final class LocalExifThumbnailProducer implements pps<l4a>
{
    public final Executor a;
    public final grk b;
    public final ContentResolver c;
    
    public LocalExifThumbnailProducer(final Executor a, final grk b, final ContentResolver c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final pk6<l4a> pk6, final n1l n1l) {
        final r1l i = n1l.i();
        final a l = n1l.l();
        n1l.f("local", "exif");
        final LocalExifThumbnailProducer$a localExifThumbnailProducer$a = new LocalExifThumbnailProducer$a(this, (pk6)pk6, i, n1l, l);
        n1l.p((o1l)new zo1(localExifThumbnailProducer$a) {
            public final par a;
            
            public final void b() {
                this.a.a();
            }
        });
        this.a.execute((Runnable)localExifThumbnailProducer$a);
    }
}
