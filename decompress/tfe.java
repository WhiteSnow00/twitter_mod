import java.io.StringReader;
import java.io.Reader;
import com.fasterxml.jackson.core.JsonParseException;
import java.io.InputStream;
import java.io.Writer;
import java.io.OutputStream;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tfe implements Serializable
{
    public static final int L0;
    public static final int M0;
    public static final int N0;
    public static final kmp O0;
    public static final ThreadLocal<SoftReference<nr2>> P0;
    public final transient gu3 F0;
    public final transient v63 G0;
    public int H0;
    public int I0;
    public int J0;
    public kmp K0;
    
    static {
        final int[] i = lb0.I(4);
        final int length = i.length;
        final int n = 0;
        int j = 0;
        int l0 = 0;
        while (j < length) {
            final int n2 = i[j];
            tf8.i(n2);
            l0 |= tf8.f(n2);
            ++j;
        }
        L0 = l0;
        final qhe$a[] values = qhe$a.values();
        final int length2 = values.length;
        int k = 0;
        int m0 = 0;
        while (k < length2) {
            final qhe$a qhe$a = values[k];
            int n3 = m0;
            if (qhe$a.F0) {
                n3 = (m0 | qhe$a.G0);
            }
            ++k;
            m0 = n3;
        }
        M0 = m0;
        final yfe$a[] values2 = yfe$a.values();
        final int length3 = values2.length;
        int n4 = 0;
        int n6;
        for (int n5 = n; n5 < length3; ++n5, n4 = n6) {
            final yfe$a yfe$a = values2[n5];
            n6 = n4;
            if (yfe$a.F0) {
                n6 = (n4 | yfe$a.G0);
            }
        }
        N0 = n4;
        O0 = ck8.F0;
        P0 = new ThreadLocal<SoftReference<nr2>>();
    }
    
    public tfe() {
        final long currentTimeMillis = System.currentTimeMillis();
        this.F0 = new gu3((int)currentTimeMillis + (int)(currentTimeMillis >>> 32) | 0x1);
        final long currentTimeMillis2 = System.currentTimeMillis();
        this.G0 = new v63((int)currentTimeMillis2 + (int)(currentTimeMillis2 >>> 32) | 0x1);
        this.H0 = tfe.L0;
        this.I0 = tfe.M0;
        this.J0 = tfe.N0;
        this.K0 = tfe.O0;
    }
    
    public final k3d a(final Object o, final boolean b) {
        nr2 nr3;
        if ((this.H0 & tf8.f(4)) != 0x0) {
            final ThreadLocal<SoftReference<nr2>> p2 = tfe.P0;
            final SoftReference softReference = p2.get();
            nr2 nr2;
            if (softReference == null) {
                nr2 = null;
            }
            else {
                nr2 = (nr2)softReference.get();
            }
            nr3 = nr2;
            if (nr2 == null) {
                nr3 = new nr2();
                p2.set(new SoftReference<nr2>(nr3));
            }
        }
        else {
            nr3 = new nr2();
        }
        return new k3d(nr3, o, b);
    }
    
    public final qhe b(final char[] array, final int n, final k3d k3d, final boolean b) throws IOException {
        return (qhe)new i1m(k3d, this.I0, this.F0.d(this.H0), array, n + 0, b);
    }
    
    public final yfe c(final OutputStream outputStream) throws IOException {
        final k3d a = this.a(outputStream, false);
        a.b = 1;
        final xsv xsv = new xsv(a, this.J0, outputStream);
        final kmp k0 = this.K0;
        if (k0 != tfe.O0) {
            ((zfe)xsv).L0 = k0;
        }
        return (yfe)xsv;
    }
    
    public final yfe d(final Writer writer) throws IOException {
        final gvx gvx = new gvx(this.a(writer, false), this.J0, writer);
        final kmp k0 = this.K0;
        if (k0 != tfe.O0) {
            ((zfe)gvx).L0 = k0;
        }
        return (yfe)gvx;
    }
    
    public final qhe e(final InputStream inputStream) throws IOException, JsonParseException {
        return new x63(this.a(inputStream, false), inputStream).b(this.I0, this.G0, this.F0, this.H0);
    }
    
    public final qhe f(final Reader reader) throws IOException, JsonParseException {
        return (qhe)new i1m(this.a(reader, false), this.I0, reader, this.F0.d(this.H0));
    }
    
    public final qhe g(final String s) throws IOException, JsonParseException {
        final int length = s.length();
        if (length <= 32768) {
            final k3d a = this.a(s, true);
            a.a((Object)a.g);
            final char[] b = a.d.b(0, length);
            s.getChars(0, length, a.g = b, 0);
            return this.b(b, length, a, true);
        }
        return this.f(new StringReader(s));
    }
    
    public final qhe h(final byte[] array) throws IOException, JsonParseException {
        return new x63(this.a(array, true), array, array.length).b(this.I0, this.G0, this.F0, this.H0);
    }
    
    public final qhe i(final char[] array) throws IOException {
        return this.b(array, array.length, this.a(array, true), false);
    }
}
