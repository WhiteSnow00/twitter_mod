import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderException;
import java.util.ArrayList;
import java.nio.ByteBuffer;
import java.util.List;
import com.google.android.exoplayer2.f$a;
import android.os.Bundle;
import android.os.Parcel;
import java.util.Objects;
import java.util.ArrayDeque;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iha implements qsr
{
    public final n87 a;
    public final ssr b;
    public final Deque<tsr> c;
    public int d;
    public boolean e;
    
    public iha() {
        this.a = new n87();
        this.b = new ssr();
        this.c = new ArrayDeque();
        for (int i = 0; i < 2; ++i) {
            this.c.addFirst(new iha$a(this));
        }
        this.d = 0;
    }
    
    public final void a(final long n) {
    }
    
    public final Object b() throws DecoderException {
        ri4.t(this.e ^ true);
        tsr tsr;
        if (this.d == 2 && !this.c.isEmpty()) {
            tsr = this.c.removeFirst();
            if (((vq2)this.b).j(4)) {
                ((vq2)tsr).i(4);
            }
            else {
                final ssr b = this.b;
                final long g0 = ((DecoderInputBuffer)b).G0;
                final n87 a = this.a;
                final ByteBuffer e0 = ((DecoderInputBuffer)b).E0;
                Objects.requireNonNull(e0);
                final byte[] array = e0.array();
                Objects.requireNonNull(a);
                final Parcel obtain = Parcel.obtain();
                obtain.unmarshall(array, 0, array.length);
                obtain.setDataPosition(0);
                final Bundle bundle = obtain.readBundle(Bundle.class.getClassLoader());
                obtain.recycle();
                final ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                Objects.requireNonNull(parcelableArrayList);
                tsr.s(((DecoderInputBuffer)this.b).G0, (psr)new iha.iha$b(g0, lt2.a((f$a)m87.U0, (List)parcelableArrayList)), 0L);
            }
            ((DecoderInputBuffer)this.b).q();
            this.d = 0;
        }
        else {
            tsr = null;
        }
        return tsr;
    }
    
    public final void c(final Object o) throws DecoderException {
        final ssr ssr = (ssr)o;
        final boolean e = this.e;
        final boolean b = true;
        ri4.t(e ^ true);
        ri4.t(this.d == 1);
        ri4.k(this.b == ssr && b);
        this.d = 2;
    }
    
    public final Object d() throws DecoderException {
        ri4.t(this.e ^ true);
        Object b;
        if (this.d != 0) {
            b = null;
        }
        else {
            this.d = 1;
            b = this.b;
        }
        return b;
    }
    
    public final void flush() {
        ri4.t(this.e ^ true);
        ((DecoderInputBuffer)this.b).q();
        this.d = 0;
    }
    
    public final void release() {
        this.e = true;
    }
}
