import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import android.os.Message;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.List;
import java.util.Collections;
import java.util.Objects;
import android.os.Looper;
import com.google.android.exoplayer2.n;
import android.os.Handler;
import android.os.Handler$Callback;
import com.google.android.exoplayer2.e;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eks extends e implements Handler$Callback
{
    public final Handler R0;
    public final vjs S0;
    public final hur T0;
    public final y8r U0;
    public boolean V0;
    public boolean W0;
    public boolean X0;
    public int Y0;
    public n Z0;
    public gur a1;
    public iur b1;
    public jur c1;
    public jur d1;
    public int e1;
    public long f1;
    
    public eks(final vjs s0, final Looper looper) {
        final hur$a a = hur.a;
        super(3);
        this.S0 = s0;
        Handler r0;
        if (looper == null) {
            r0 = null;
        }
        else {
            final int a2 = rnw.a;
            r0 = new Handler(looper, (Handler$Callback)this);
        }
        this.R0 = r0;
        this.T0 = (hur)a;
        this.U0 = new y8r(1);
        this.f1 = -9223372036854775807L;
    }
    
    @Override
    public final void C() {
        this.Z0 = null;
        this.f1 = -9223372036854775807L;
        this.K();
        this.O();
        final gur a1 = this.a1;
        Objects.requireNonNull(a1);
        ((bd8)a1).release();
        this.a1 = null;
        this.Y0 = 0;
    }
    
    @Override
    public final void E(final long n, final boolean b) {
        this.K();
        this.V0 = false;
        this.W0 = false;
        this.f1 = -9223372036854775807L;
        if (this.Y0 != 0) {
            this.P();
        }
        else {
            this.O();
            final gur a1 = this.a1;
            Objects.requireNonNull(a1);
            ((bd8)a1).flush();
        }
    }
    
    @Override
    public final void I(final n[] array, final long n, final long n2) {
        this.Z0 = array[0];
        if (this.a1 != null) {
            this.Y0 = 1;
        }
        else {
            this.N();
        }
    }
    
    public final void K() {
        final List<Object> emptyList = Collections.emptyList();
        final Handler r0 = this.R0;
        if (r0 != null) {
            r0.obtainMessage(0, (Object)emptyList).sendToTarget();
        }
        else {
            this.S0.d((List)emptyList);
        }
    }
    
    public final long L() {
        final int e1 = this.e1;
        long n = Long.MAX_VALUE;
        if (e1 == -1) {
            return Long.MAX_VALUE;
        }
        Objects.requireNonNull(this.c1);
        final int e2 = this.e1;
        final fur h0 = this.c1.H0;
        Objects.requireNonNull(h0);
        if (e2 < h0.g()) {
            final jur c1 = this.c1;
            final int e3 = this.e1;
            final fur h2 = c1.H0;
            Objects.requireNonNull(h2);
            n = h2.f(e3) + c1.I0;
        }
        return n;
    }
    
    public final void M(final SubtitleDecoderException ex) {
        final String value = String.valueOf(this.Z0);
        final StringBuilder sb = new StringBuilder(value.length() + 39);
        sb.append("Subtitle decoding failed. streamFormat=");
        sb.append(value);
        tqb.y("TextRenderer", sb.toString(), (Throwable)ex);
        this.K();
        this.P();
    }
    
    public final void N() {
        int n = 1;
        this.X0 = true;
        final hur t0 = this.T0;
        final n z0 = this.Z0;
        Objects.requireNonNull(z0);
        Objects.requireNonNull((hur$a)t0);
        final String q0 = z0.Q0;
        Label_0572: {
            if (q0 != null) {
                Label_0358: {
                    switch (q0) {
                        case "application/ttml+xml": {
                            n = 11;
                            break Label_0358;
                        }
                        case "application/x-subrip": {
                            n = 10;
                            break Label_0358;
                        }
                        case "application/cea-708": {
                            n = 9;
                            break Label_0358;
                        }
                        case "application/cea-608": {
                            n = 8;
                            break Label_0358;
                        }
                        case "text/x-exoplayer-cues": {
                            n = 7;
                            break Label_0358;
                        }
                        case "application/x-mp4-cea-608": {
                            n = 6;
                            break Label_0358;
                        }
                        case "text/x-ssa": {
                            n = 5;
                            break Label_0358;
                        }
                        case "application/x-quicktime-tx3g": {
                            n = 4;
                            break Label_0358;
                        }
                        case "text/vtt": {
                            n = 3;
                            break Label_0358;
                        }
                        case "application/x-mp4-vtt": {
                            n = 2;
                            break Label_0358;
                        }
                        case "application/pgs": {
                            break Label_0358;
                        }
                        case "application/dvbsubs": {
                            n = 0;
                            break Label_0358;
                        }
                        default:
                            break;
                    }
                    n = -1;
                }
                Object a1 = null;
                switch (n) {
                    default: {
                        break Label_0572;
                    }
                    case 11: {
                        a1 = new tbu();
                        break;
                    }
                    case 10: {
                        a1 = new dnr();
                        break;
                    }
                    case 9: {
                        a1 = new zn3(z0.i1, z0.S0);
                        break;
                    }
                    case 7: {
                        a1 = new uha();
                        break;
                    }
                    case 6:
                    case 8: {
                        a1 = new yn3(q0, z0.i1);
                        break;
                    }
                    case 5: {
                        a1 = new b6r(z0.S0);
                        break;
                    }
                    case 4: {
                        a1 = new niv(z0.S0);
                        break;
                    }
                    case 3: {
                        a1 = new kox();
                        break;
                    }
                    case 2: {
                        a1 = new ish();
                        break;
                    }
                    case 1: {
                        a1 = new ybk();
                        break;
                    }
                    case 0: {
                        a1 = new vm9(z0.S0);
                        break;
                    }
                }
                this.a1 = (gur)a1;
                return;
            }
        }
        final String value = String.valueOf(q0);
        String concat;
        if (value.length() != 0) {
            concat = "Attempted to create decoder for unsupported MIME type: ".concat(value);
        }
        else {
            concat = new String("Attempted to create decoder for unsupported MIME type: ");
        }
        throw new IllegalArgumentException(concat);
    }
    
    public final void O() {
        this.b1 = null;
        this.e1 = -1;
        final jur c1 = this.c1;
        if (c1 != null) {
            ((dd8)c1).q();
            this.c1 = null;
        }
        final jur d1 = this.d1;
        if (d1 != null) {
            ((dd8)d1).q();
            this.d1 = null;
        }
    }
    
    public final void P() {
        this.O();
        final gur a1 = this.a1;
        Objects.requireNonNull(a1);
        ((bd8)a1).release();
        this.a1 = null;
        this.Y0 = 0;
        this.N();
    }
    
    public final boolean c() {
        return true;
    }
    
    public final int e(final n n) {
        Objects.requireNonNull((hur$a)this.T0);
        final String q0 = n.Q0;
        if ("text/vtt".equals(q0) || "text/x-ssa".equals(q0) || "application/ttml+xml".equals(q0) || "application/x-mp4-vtt".equals(q0) || "application/x-subrip".equals(q0) || "application/x-quicktime-tx3g".equals(q0) || "application/cea-608".equals(q0) || "application/x-mp4-cea-608".equals(q0) || "application/cea-708".equals(q0) || "application/dvbsubs".equals(q0) || "application/pgs".equals(q0) || "text/x-exoplayer-cues".equals(q0)) {
            int n2;
            if (n.j1 == 0) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            return c0e.b(n2);
        }
        if (rbh.j(n.Q0)) {
            return c0e.b(1);
        }
        return c0e.b(0);
    }
    
    public final boolean f() {
        return this.W0;
    }
    
    public final String getName() {
        return "TextRenderer";
    }
    
    public final boolean handleMessage(final Message message) {
        if (message.what == 0) {
            this.S0.d((List)message.obj);
            return true;
        }
        throw new IllegalStateException();
    }
    
    public final void v(final long n, long n2) {
        if (super.P0) {
            n2 = this.f1;
            if (n2 != -9223372036854775807L && n >= n2) {
                this.O();
                this.W0 = true;
            }
        }
        if (this.W0) {
            return;
        }
        if (this.d1 == null) {
            final gur a1 = this.a1;
            Objects.requireNonNull(a1);
            a1.a(n);
            try {
                final gur a2 = this.a1;
                Objects.requireNonNull(a2);
                this.d1 = (jur)((bd8)a2).b();
            }
            catch (final SubtitleDecoderException ex) {
                this.M(ex);
                return;
            }
        }
        if (super.K0 != 2) {
            return;
        }
        int n3;
        if (this.c1 != null) {
            n2 = this.L();
            n3 = 0;
            while (n2 <= n) {
                ++this.e1;
                n2 = this.L();
                n3 = 1;
            }
        }
        else {
            n3 = 0;
        }
        final jur d1 = this.d1;
        int n4 = n3;
        if (d1 != null) {
            if (((dr2)d1).j(4)) {
                n4 = n3;
                if (n3 == 0) {
                    n4 = n3;
                    if (this.L() == Long.MAX_VALUE) {
                        if (this.Y0 == 2) {
                            this.P();
                            n4 = n3;
                        }
                        else {
                            this.O();
                            this.W0 = true;
                            n4 = n3;
                        }
                    }
                }
            }
            else {
                n4 = n3;
                if (((dd8)d1).G0 <= n) {
                    final jur c1 = this.c1;
                    if (c1 != null) {
                        ((dd8)c1).q();
                    }
                    final fur h0 = d1.H0;
                    Objects.requireNonNull(h0);
                    this.e1 = h0.b(n - d1.I0);
                    this.c1 = d1;
                    this.d1 = null;
                    n4 = 1;
                }
            }
        }
        if (n4 != 0) {
            Objects.requireNonNull(this.c1);
            final jur c2 = this.c1;
            final fur h2 = c2.H0;
            Objects.requireNonNull(h2);
            final List e = h2.e(n - c2.I0);
            final Handler r0 = this.R0;
            if (r0 != null) {
                r0.obtainMessage(0, (Object)e).sendToTarget();
            }
            else {
                this.S0.d(e);
            }
        }
        if (this.Y0 == 2) {
            return;
        }
        try {
            iur b1 = null;
            Block_26: {
                while (!this.V0) {
                    if ((b1 = this.b1) == null) {
                        final gur a3 = this.a1;
                        Objects.requireNonNull(a3);
                        b1 = (iur)((bd8)a3).d();
                        if (b1 == null) {
                            return;
                        }
                        this.b1 = b1;
                    }
                    if (this.Y0 == 1) {
                        break Block_26;
                    }
                    final int j = this.J(this.U0, (DecoderInputBuffer)b1, 0);
                    if (j == -4) {
                        if (((dr2)b1).j(4)) {
                            this.V0 = true;
                            this.X0 = false;
                        }
                        else {
                            final n n5 = (n)this.U0.H0;
                            if (n5 == null) {
                                return;
                            }
                            b1.N0 = n5.U0;
                            ((DecoderInputBuffer)b1).t();
                            this.X0 &= !((dr2)b1).j(1);
                        }
                        if (this.X0) {
                            continue;
                        }
                        final gur a4 = this.a1;
                        Objects.requireNonNull((Object)a4);
                        ((bd8)a4).c((Object)b1);
                        this.b1 = null;
                    }
                    else {
                        if (j == -3) {
                            return;
                        }
                        continue;
                    }
                }
                return;
            }
            ((dr2)b1).F0 = 4;
            final gur a5 = this.a1;
            Objects.requireNonNull((Object)a5);
            ((bd8)a5).c((Object)b1);
            this.b1 = null;
            this.Y0 = 2;
        }
        catch (final SubtitleDecoderException ex2) {
            this.M(ex2);
        }
    }
}
