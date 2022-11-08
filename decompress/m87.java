import java.util.Arrays;
import android.text.TextUtils;
import android.text.SpannedString;
import android.text.Spanned;
import java.util.Objects;
import android.graphics.Bitmap;
import android.text.Layout$Alignment;
import com.google.android.exoplayer2.f$a;
import com.google.android.exoplayer2.f;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m87 implements f
{
    public static final m87 T0;
    public static final f$a<m87> U0;
    public final CharSequence C0;
    public final Layout$Alignment D0;
    public final Layout$Alignment E0;
    public final Bitmap F0;
    public final float G0;
    public final int H0;
    public final int I0;
    public final float J0;
    public final int K0;
    public final float L0;
    public final float M0;
    public final boolean N0;
    public final int O0;
    public final int P0;
    public final float Q0;
    public final int R0;
    public final float S0;
    
    static {
        T0 = new m87("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        m87.U0 = i71.M0;
    }
    
    @Deprecated
    public m87(final CharSequence charSequence, final Layout$Alignment layout$Alignment, final float n, final int n2, final float n3, final int n4, final float n5, final boolean b, final int n6) {
        this(charSequence, layout$Alignment, null, null, n, 1, n2, n3, n4, Integer.MIN_VALUE, -3.4028235E38f, n5, -3.4028235E38f, b, n6, Integer.MIN_VALUE, 0.0f);
    }
    
    public m87(final CharSequence charSequence, final Layout$Alignment d0, final Layout$Alignment e0, final Bitmap f0, final float g0, final int h0, final int i0, final float j0, final int k0, final int p17, final float q0, final float l0, final float m0, final boolean n0, final int o0, final int r0, final float s0) {
        if (charSequence == null) {
            Objects.requireNonNull(f0);
        }
        else {
            ri4.k(f0 == null);
        }
        if (charSequence instanceof Spanned) {
            this.C0 = (CharSequence)SpannedString.valueOf(charSequence);
        }
        else if (charSequence != null) {
            this.C0 = charSequence.toString();
        }
        else {
            this.C0 = null;
        }
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p17;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
    }
    
    public static String b(final int n) {
        return Integer.toString(n, 36);
    }
    
    public final m87.m87$a a() {
        return new m87.m87$a(this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && m87.class == o.getClass()) {
            final m87 m87 = (m87)o;
            if (TextUtils.equals(this.C0, m87.C0) && this.D0 == m87.D0 && this.E0 == m87.E0) {
                final Bitmap f0 = this.F0;
                if (f0 == null) {
                    if (m87.F0 != null) {
                        return false;
                    }
                }
                else {
                    final Bitmap f2 = m87.F0;
                    if (f2 == null || !f0.sameAs(f2)) {
                        return false;
                    }
                }
                if (this.G0 == m87.G0 && this.H0 == m87.H0 && this.I0 == m87.I0 && this.J0 == m87.J0 && this.K0 == m87.K0 && this.L0 == m87.L0 && this.M0 == m87.M0 && this.N0 == m87.N0 && this.O0 == m87.O0 && this.P0 == m87.P0 && this.Q0 == m87.Q0 && this.R0 == m87.R0 && this.S0 == m87.S0) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.C0, this.D0, this.E0, this.F0, this.G0, this.H0, this.I0, this.J0, this.K0, this.L0, this.M0, this.N0, this.O0, this.P0, this.Q0, this.R0, this.S0 });
    }
}
