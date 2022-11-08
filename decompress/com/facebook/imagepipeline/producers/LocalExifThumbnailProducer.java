// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.a;
import android.content.ContentResolver;
import java.util.concurrent.Executor;

public final class LocalExifThumbnailProducer implements cos<z3a>
{
    public final Executor a;
    public final lqk b;
    public final ContentResolver c;
    
    public LocalExifThumbnailProducer(final Executor a, final lqk b, final ContentResolver c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final dk6<z3a> dk6, final q0l q0l) {
        final u0l i = q0l.i();
        final a l = q0l.l();
        q0l.f("local", "exif");
        final LocalExifThumbnailProducer$a localExifThumbnailProducer$a = new LocalExifThumbnailProducer$a(this, (dk6)dk6, i, q0l, l);
        q0l.p((r0l)new xo1() {
            public final void b() {
                ((v8r)localExifThumbnailProducer$a).a();
            }
        });
        this.a.execute((Runnable)localExifThumbnailProducer$a);
    }
}
