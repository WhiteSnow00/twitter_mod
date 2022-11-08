import android.media.AudioTimestamp;
import android.media.AudioTrack;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k41
{
    public final a a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    
    public k41(final AudioTrack audioTrack) {
        if (imw.a >= 19) {
            this.a = new a(audioTrack);
            this.a();
        }
        else {
            this.a = null;
            this.b(3);
        }
    }
    
    public final void a() {
        if (this.a != null) {
            this.b(0);
        }
    }
    
    public final void b(final int b) {
        this.b = b;
        if (b != 0) {
            if (b != 1) {
                if (b != 2 && b != 3) {
                    if (b != 4) {
                        throw new IllegalStateException();
                    }
                    this.d = 500000L;
                }
                else {
                    this.d = 10000000L;
                }
            }
            else {
                this.d = 10000L;
            }
        }
        else {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000L;
            this.d = 10000L;
        }
    }
    
    public static final class a
    {
        public final AudioTrack a;
        public final AudioTimestamp b;
        public long c;
        public long d;
        public long e;
        
        public a(final AudioTrack a) {
            this.a = a;
            this.b = new AudioTimestamp();
        }
    }
}
