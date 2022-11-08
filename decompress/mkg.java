import java.io.IOException;
import java.util.Objects;
import com.bluelinelabs.logansquare.typeconverters.TypeConverter;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class mkg<T> extends twj<Map<String, T>>
{
    public final pwj<T> a;
    
    public mkg(final TypeConverter<T> typeConverter) {
        final c8f a = new c8f((Object)typeConverter);
        this.a = (pwj<T>)a;
    }
    
    public mkg(final Class<T> clazz) {
        final fcn a = new fcn((Object)clazz, 22);
        this.a = (pwj<T>)a;
    }
    
    public final Map<String, T> a(final khe khe) throws IOException {
        if (khe.e() == lje.K0) {
            final pwj<T> a = this.a;
            final ofe a2 = bih.a;
            return bih.k(khe, (pwj)a, sjg.t());
        }
        final lje e = khe.e();
        final lje m0 = lje.M0;
        if (e == m0) {
            final sjg t = sjg.t();
            if (khe.e() == m0) {
                for (lje lje = khe.i0(); lje != null && lje != lje.N0; lje = khe.i0()) {
                    if (((Enum)lje).ordinal() == 1) {
                        Map o = null;
                        Label_0192: {
                            if (khe.e() != lje.K0) {
                                khe.m0();
                            }
                            else {
                                Object p = null;
                                while (khe.i0() != lje.L0) {
                                    final String d = khe.d();
                                    khe.i0();
                                    Objects.requireNonNull(d);
                                    if (!d.equals("key")) {
                                        if (!d.equals("value")) {
                                            khe.m0();
                                        }
                                        else {
                                            final Object d2 = this.a.d(khe);
                                            if (p != null) {
                                                o = sjg.o(p, d2);
                                                break Label_0192;
                                            }
                                            continue;
                                        }
                                    }
                                    else {
                                        p = khe.P();
                                    }
                                }
                            }
                            o = null;
                        }
                        t.x(o);
                    }
                }
            }
            return (Map)((h4j)t).e();
        }
        return null;
    }
}
