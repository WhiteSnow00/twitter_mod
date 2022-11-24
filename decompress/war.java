import android.text.StaticLayout$Builder;
import android.os.Build$VERSION;
import android.text.StaticLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class war implements cbr
{
    @Override
    public final boolean a(final StaticLayout staticLayout, boolean a) {
        if (qs2.b()) {
            a = zar.a(staticLayout);
        }
        else if (Build$VERSION.SDK_INT < 28) {
            a = false;
        }
        return a;
    }
    
    @Override
    public StaticLayout b(final dbr dbr) {
        e0e.f((Object)dbr, "params");
        final StaticLayout$Builder obtain = StaticLayout$Builder.obtain(dbr.a, dbr.b, dbr.c, dbr.d, dbr.e);
        obtain.setTextDirection(dbr.f);
        obtain.setAlignment(dbr.g);
        obtain.setMaxLines(dbr.h);
        obtain.setEllipsize(dbr.i);
        obtain.setEllipsizedWidth(dbr.j);
        obtain.setLineSpacing(dbr.l, dbr.k);
        obtain.setIncludePad(dbr.n);
        obtain.setBreakStrategy(dbr.p);
        obtain.setHyphenationFrequency(dbr.s);
        obtain.setIndents(dbr.t, dbr.u);
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 26) {
            xar.a(obtain, dbr.m);
        }
        if (sdk_INT >= 28) {
            yar.a(obtain, dbr.o);
        }
        if (sdk_INT >= 33) {
            zar.b(obtain, dbr.q, dbr.r);
        }
        final StaticLayout build = obtain.build();
        e0e.e((Object)build, "obtain(params.text, para\u2026  }\n            }.build()");
        return build;
    }
}
