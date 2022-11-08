import java.util.Map;
import com.facebook.imagepipeline.request.a;
import com.facebook.common.memory.PooledByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c4a implements p0l<z3a>
{
    public final s3h<q73, PooledByteBuffer> a;
    public final u73 b;
    public final p0l<z3a> c;
    
    public c4a(final s3h<q73, PooledByteBuffer> a, final u73 b, final p0l<z3a> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final dk6<z3a> dk6, final q0l q0l) {
        try {
            srb.b();
            final u0l i = q0l.i();
            i.k(q0l, "EncodedMemoryCacheProducer");
            final a l = q0l.l();
            final u73 b = this.b;
            q0l.a();
            final q73 j = ((pf8)b).L(l);
            final wi4 value = this.a.get((Object)j);
            final Map map = null;
            Map of = null;
            Label_0176: {
                if (value == null) {
                    break Label_0176;
                }
                try {
                    final z3a z3a = new z3a(value);
                    try {
                        if (i.j(q0l, "EncodedMemoryCacheProducer")) {
                            of = ied.of((Object)"cached_value_found", (Object)"true");
                        }
                        i.a(q0l, "EncodedMemoryCacheProducer", of);
                        i.d(q0l, "EncodedMemoryCacheProducer", true);
                        q0l.h("memory_encoded");
                        dk6.b(1.0f);
                        dk6.c((Object)z3a, 1);
                        return;
                    }
                    finally {
                        z3a.b(z3a);
                    }
                    if (q0l.o().C0 >= 3) {
                        Map of2;
                        if (i.j(q0l, "EncodedMemoryCacheProducer")) {
                            of2 = ied.of((Object)"cached_value_found", (Object)"false");
                        }
                        else {
                            of2 = null;
                        }
                        i.a(q0l, "EncodedMemoryCacheProducer", of2);
                        i.d(q0l, "EncodedMemoryCacheProducer", false);
                        q0l.f("memory_encoded", "nil-result");
                        dk6.c((Object)null, 1);
                        return;
                    }
                    final c4a.c4a$a c4a$a = new c4a.c4a$a((dk6)dk6, (s3h)this.a, j, q0l.l().m, q0l.e().D().d);
                    Map of3 = map;
                    if (i.j(q0l, "EncodedMemoryCacheProducer")) {
                        of3 = ied.of((Object)"cached_value_found", (Object)"false");
                    }
                    i.a(q0l, "EncodedMemoryCacheProducer", of3);
                    this.c.a((dk6)c4a$a, q0l);
                }
                finally {
                    wi4.e(value);
                }
            }
        }
        finally {
            srb.b();
        }
    }
}
