import java.io.IOException;
import java.io.FileOutputStream;
import java.io.File;
import java.io.OutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xpy extends OutputStream
{
    public final fvy C0;
    public final File D0;
    public final gzy E0;
    public long F0;
    public long G0;
    public FileOutputStream H0;
    public cly I0;
    
    public xpy(final File d0, final gzy e0) {
        this.C0 = new fvy();
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final void write(final int n) throws IOException {
        this.write(new byte[] { (byte)n }, 0, 1);
    }
    
    @Override
    public final void write(final byte[] array) throws IOException {
        this.write(array, 0, array.length);
    }
    
    @Override
    public final void write(final byte[] array, int a, int i) throws IOException {
        int n = a;
        while (i > 0) {
            int n2 = n;
            a = i;
            if (this.F0 == 0L) {
                n2 = n;
                a = i;
                if (this.G0 == 0L) {
                    a = this.C0.a(array, n, i);
                    if (a == -1) {
                        return;
                    }
                    n2 = n + a;
                    a = i - a;
                    final cly i2 = (cly)this.C0.b();
                    this.I0 = i2;
                    if (i2.e) {
                        this.F0 = 0L;
                        final gzy e0 = this.E0;
                        final byte[] f = i2.f;
                        e0.k(f, f.length);
                        this.G0 = this.I0.f.length;
                    }
                    else if (i2.h() && !this.I0.g()) {
                        this.E0.i(this.I0.f);
                        final File file = new File(this.D0, this.I0.a);
                        file.getParentFile().mkdirs();
                        this.F0 = this.I0.b;
                        this.H0 = new FileOutputStream(file);
                    }
                    else {
                        final byte[] f2 = this.I0.f;
                        this.E0.k(f2, f2.length);
                        this.F0 = this.I0.b;
                    }
                }
            }
            if (this.I0.g()) {
                n = n2;
                i = a;
            }
            else {
                final cly i3 = this.I0;
                if (i3.e) {
                    this.E0.d(this.G0, array, n2, a);
                    this.G0 += a;
                    i = a;
                }
                else if (i3.h()) {
                    final int n3 = (int)Math.min(a, this.F0);
                    this.H0.write(array, n2, n3);
                    final long f3 = this.F0 - n3;
                    this.F0 = f3;
                    i = n3;
                    if (f3 == 0L) {
                        this.H0.close();
                        i = n3;
                    }
                }
                else {
                    i = (int)Math.min(a, this.F0);
                    final cly i4 = this.I0;
                    this.E0.d(i4.f.length + i4.b - this.F0, array, n2, i);
                    this.F0 -= i;
                }
                n = n2 + i;
                i = a - i;
            }
        }
    }
}
