import com.facebook.imagepipeline.request.a;
import java.util.Map;
import com.facebook.common.memory.PooledByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o4a implements m1l<l4a>
{
    public final k4h<z73, PooledByteBuffer> a;
    public final d83 b;
    public final m1l<l4a> c;
    
    public o4a(final k4h<z73, PooledByteBuffer> a, final d83 b, final m1l<l4a> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final pk6<l4a> pk6, final n1l n1l) {
        try {
            rrb.b();
            final r1l i = n1l.i();
            i.k(n1l, "EncodedMemoryCacheProducer");
            final a l = n1l.l();
            final d83 b = this.b;
            n1l.a();
            final z73 v = ((eg8)b).V(l);
            final cj4<PooledByteBuffer> value = this.a.get(v);
            final Map<String, String> map = null;
            final Map<String, String> map2 = null;
            Label_0185: {
                if (value == null) {
                    break Label_0185;
                }
                try {
                    final l4a l4a = new l4a((cj4)value);
                    Map<String, String> of = map2;
                    try {
                        if (i.j(n1l, "EncodedMemoryCacheProducer")) {
                            of = med.of((Object)"cached_value_found", (Object)"true");
                        }
                        i.a(n1l, "EncodedMemoryCacheProducer", of);
                        i.d(n1l, "EncodedMemoryCacheProducer", true);
                        n1l.h("memory_encoded");
                        pk6.b(1.0f);
                        pk6.c(l4a, 1);
                        return;
                    }
                    finally {
                        l4a.b(l4a);
                    }
                    if (n1l.o().F0 >= 3) {
                        Map of2;
                        if (i.j(n1l, "EncodedMemoryCacheProducer")) {
                            of2 = med.of((Object)"cached_value_found", (Object)"false");
                        }
                        else {
                            of2 = null;
                        }
                        i.a(n1l, "EncodedMemoryCacheProducer", of2);
                        i.d(n1l, "EncodedMemoryCacheProducer", false);
                        n1l.f("memory_encoded", "nil-result");
                        pk6.c(null, 1);
                        return;
                    }
                    final o4a.o4a$a o4a$a = new o4a.o4a$a((pk6)pk6, (k4h)this.a, v, n1l.l().m, n1l.e().D().d);
                    Map<String, String> of3 = map;
                    if (i.j(n1l, "EncodedMemoryCacheProducer")) {
                        of3 = med.of((Object)"cached_value_found", (Object)"false");
                    }
                    i.a(n1l, "EncodedMemoryCacheProducer", of3);
                    this.c.a((pk6<l4a>)o4a$a, n1l);
                }
                finally {
                    cj4.e(value);
                }
            }
        }
        finally {
            rrb.b();
        }
    }
}
