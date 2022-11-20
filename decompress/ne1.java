import java.util.Objects;
import android.graphics.RectF;
import android.graphics.Paint$Style;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ne1 extends p6b
{
    public me1 F0;
    public ezt G0;
    public Paint H0;
    public Paint I0;
    public Paint J0;
    public Paint K0;
    
    public ne1(final oax oax, final ezt g0, final me1 f0) {
        super((Object)oax, 3);
        this.G0 = g0;
        this.F0 = f0;
        if (super.E0 != null) {
            this.I0 = new Paint(1);
            (this.H0 = new Paint()).setColor(-7829368);
            this.H0.setStrokeWidth(1.0f);
            this.H0.setStyle(Paint$Style.STROKE);
            this.H0.setAlpha(90);
            (this.J0 = new Paint()).setColor(-16777216);
            this.J0.setStrokeWidth(1.0f);
            this.J0.setStyle(Paint$Style.STROKE);
            (this.K0 = new Paint(1)).setStyle(Paint$Style.STROKE);
        }
    }
    
    public void e(float n, final float n2) {
        final oax oax = (oax)super.E0;
        float n3 = n;
        float n4 = n2;
        if (oax != null) {
            n3 = n;
            n4 = n2;
            if (oax.a() > 10.0f) {
                n3 = n;
                n4 = n2;
                if (!((oax)super.E0).c()) {
                    final ezt g0 = this.G0;
                    final RectF b = ((oax)super.E0).b;
                    final weg b2 = g0.b(b.left, b.top);
                    final ezt g2 = this.G0;
                    final RectF b3 = ((oax)super.E0).b;
                    final weg b4 = g2.b(b3.left, b3.bottom);
                    n = (float)b4.c;
                    n4 = (float)b2.c;
                    weg.c(b2);
                    weg.c(b4);
                    n3 = n;
                }
            }
        }
        this.g(n3, n4);
    }
    
    public void g(final float n, final float n2) {
        Objects.requireNonNull(this.F0);
        final double n3 = Math.abs(n2 - n);
        if (n3 > 0.0 && !Double.isInfinite(n3)) {
            final double n4 = inw.e(n3 / 6);
            Objects.requireNonNull(this.F0);
            final double n5 = inw.e(Math.pow(10.0, (int)Math.log10(n4)));
            double floor = n4;
            if ((int)(n4 / n5) > 5) {
                floor = Math.floor(n5 * 10.0);
            }
            Objects.requireNonNull(this.F0);
            Objects.requireNonNull(this.F0);
            final double n6 = dcmpl(floor, 0.0);
            double n7;
            if (n6 == 0) {
                n7 = 0.0;
            }
            else {
                n7 = Math.ceil(n / floor) * floor;
            }
            Objects.requireNonNull(this.F0);
            double longBitsToDouble;
            if (n6 == 0) {
                longBitsToDouble = 0.0;
            }
            else {
                longBitsToDouble = Math.floor(n2 / floor) * floor;
                if (longBitsToDouble != Double.POSITIVE_INFINITY) {
                    final double n8 = longBitsToDouble + 0.0;
                    final long doubleToRawLongBits = Double.doubleToRawLongBits(n8);
                    long n9;
                    if (n8 >= 0.0) {
                        n9 = 1L;
                    }
                    else {
                        n9 = -1L;
                    }
                    longBitsToDouble = Double.longBitsToDouble(doubleToRawLongBits + n9);
                }
            }
            int h;
            if (n6 != 0) {
                double n10 = n7;
                int n11 = 0;
                while (true) {
                    h = n11;
                    if (n10 > longBitsToDouble) {
                        break;
                    }
                    ++n11;
                    n10 += floor;
                }
            }
            else {
                h = 0;
            }
            final me1 f0 = this.F0;
            if (f0.g.length < (f0.h = h)) {
                f0.g = new float[h];
            }
            for (int i = 0; i < h; ++i) {
                double n12 = n7;
                if (n7 == 0.0) {
                    n12 = 0.0;
                }
                this.F0.g[i] = (float)n12;
                n7 = n12 + floor;
            }
            if (floor < 1.0) {
                this.F0.i = (int)Math.ceil(-Math.log10(floor));
            }
            else {
                this.F0.i = 0;
            }
            Objects.requireNonNull(this.F0);
            return;
        }
        final me1 f2 = this.F0;
        f2.g = new float[0];
        f2.h = 0;
    }
}
