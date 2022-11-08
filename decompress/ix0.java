import android.media.MediaCodec;
import android.media.MediaCodec$CodecException;
import android.media.MediaFormat;
import android.media.MediaCodec$BufferInfo;
import java.util.ArrayDeque;
import android.os.Handler;
import android.os.HandlerThread;
import android.media.MediaCodec$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ix0 extends MediaCodec$Callback
{
    public final Object a;
    public final HandlerThread b;
    public Handler c;
    public final xtd d;
    public final xtd e;
    public final ArrayDeque<MediaCodec$BufferInfo> f;
    public final ArrayDeque<MediaFormat> g;
    public MediaFormat h;
    public MediaFormat i;
    public MediaCodec$CodecException j;
    public long k;
    public boolean l;
    public IllegalStateException m;
    
    public ix0(final HandlerThread b) {
        this.a = new Object();
        this.b = b;
        this.d = new xtd();
        this.e = new xtd();
        this.f = new ArrayDeque<MediaCodec$BufferInfo>();
        this.g = new ArrayDeque<MediaFormat>();
    }
    
    public final void a(final MediaCodec mediaCodec) {
        synchronized (this.a) {
            ++this.k;
            final Handler c = this.c;
            final int a = imw.a;
            c.post((Runnable)new yqm((Object)this, (Object)mediaCodec, 5));
        }
    }
    
    public final void b() {
        if (!this.g.isEmpty()) {
            this.i = this.g.getLast();
        }
        final xtd d = this.d;
        d.a = 0;
        d.b = -1;
        d.c = 0;
        final xtd e = this.e;
        e.a = 0;
        e.b = -1;
        e.c = 0;
        this.f.clear();
        this.g.clear();
        this.j = null;
    }
    
    public final void c(final MediaCodec mediaCodec) {
        ri4.t(this.c == null);
        ((Thread)this.b).start();
        final Handler c = new Handler(this.b.getLooper());
        mediaCodec.setCallback((MediaCodec$Callback)this, c);
        this.c = c;
    }
    
    public final void d(final IllegalStateException m) {
        synchronized (this.a) {
            this.m = m;
        }
    }
    
    public final void onError(final MediaCodec mediaCodec, final MediaCodec$CodecException j) {
        synchronized (this.a) {
            this.j = j;
        }
    }
    
    public final void onInputBufferAvailable(final MediaCodec mediaCodec, final int n) {
        synchronized (this.a) {
            this.d.a(n);
        }
    }
    
    public final void onOutputBufferAvailable(final MediaCodec mediaCodec, final int n, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        synchronized (this.a) {
            final MediaFormat i = this.i;
            if (i != null) {
                this.e.a(-2);
                this.g.add(i);
                this.i = null;
            }
            this.e.a(n);
            this.f.add(mediaCodec$BufferInfo);
        }
    }
    
    public final void onOutputFormatChanged(final MediaCodec mediaCodec, final MediaFormat mediaFormat) {
        synchronized (this.a) {
            this.e.a(-2);
            this.g.add(mediaFormat);
            this.i = null;
        }
    }
}
