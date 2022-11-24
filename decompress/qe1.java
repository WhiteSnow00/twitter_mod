import java.util.Objects;
import android.graphics.RectF;
import android.graphics.Paint$Style;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class qe1 extends q7b
{
    public pe1 H0;
    public xzt I0;
    public Paint J0;
    public Paint K0;
    public Paint L0;
    public Paint M0;
    
    public qe1(final hbx hbx, final xzt i0, final pe1 h0) {
        super(hbx, 3);
        this.I0 = i0;
        this.H0 = h0;
        if (super.G0 != null) {
            this.K0 = new Paint(1);
            (this.J0 = new Paint()).setColor(-7829368);
            this.J0.setStrokeWidth(1.0f);
            this.J0.setStyle(Paint$Style.STROKE);
            this.J0.setAlpha(90);
            (this.L0 = new Paint()).setColor(-16777216);
            this.L0.setStrokeWidth(1.0f);
            this.L0.setStyle(Paint$Style.STROKE);
            (this.M0 = new Paint(1)).setStyle(Paint$Style.STROKE);
        }
    }
    
    public void e(float n, final float n2) {
        final hbx hbx = (hbx)super.G0;
        float n3 = n;
        float n4 = n2;
        if (hbx != null) {
            n3 = n;
            n4 = n2;
            if (hbx.a() > 10.0f) {
                n3 = n;
                n4 = n2;
                if (!((hbx)super.G0).c()) {
                    final xzt i0 = this.I0;
                    final RectF b = ((hbx)super.G0).b;
                    final pfg b2 = i0.b(b.left, b.top);
                    final xzt i2 = this.I0;
                    final RectF b3 = ((hbx)super.G0).b;
                    final pfg b4 = i2.b(b3.left, b3.bottom);
                    n = (float)b4.c;
                    n4 = (float)b2.c;
                    pfg.c(b2);
                    pfg.c(b4);
                    n3 = n;
                }
            }
        }
        this.i(n3, n4);
    }
    
    public void i(final float n, final float n2) {
        Objects.requireNonNull(this.H0);
        final double n3 = Math.abs(n2 - n);
        if (n3 > 0.0 && !Double.isInfinite(n3)) {
            final double n4 = xnw.e(n3 / 6);
            Objects.requireNonNull(this.H0);
            final double n5 = xnw.e(Math.pow(10.0, (int)Math.log10(n4)));
            double floor = n4;
            if ((int)(n4 / n5) > 5) {
                floor = Math.floor(n5 * 10.0);
            }
            Objects.requireNonNull(this.H0);
            Objects.requireNonNull(this.H0);
            final double n6 = dcmpl(floor, 0.0);
            double n7;
            if (n6 == 0) {
                n7 = 0.0;
            }
            else {
                n7 = Math.ceil(n / floor) * floor;
            }
            Objects.requireNonNull(this.H0);
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
            final pe1 h2 = this.H0;
            if (h2.g.length < (h2.h = h)) {
                h2.g = new float[h];
            }
            for (int i = 0; i < h; ++i) {
                double n12 = n7;
                if (n7 == 0.0) {
                    n12 = 0.0;
                }
                this.H0.g[i] = (float)n12;
                n7 = n12 + floor;
            }
            if (floor < 1.0) {
                this.H0.i = (int)Math.ceil(-Math.log10(floor));
            }
            else {
                this.H0.i = 0;
            }
            Objects.requireNonNull(this.H0);
            return;
        }
        final pe1 h3 = this.H0;
        h3.g = new float[0];
        h3.h = 0;
    }
}
