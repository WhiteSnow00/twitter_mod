import java.io.IOException;
import com.twitter.model.json.page.JsonPage;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b8c extends twj<ssj>
{
    public final Object parse(final khe khe) throws IOException {
        u4c.g();
        try {
            final JsonPage jsonPage = (JsonPage)bih.c(khe, (Class)JsonPage.class, false);
            final xrj b = jsonPage.b;
            final zrj$a zrj$a = new zrj$a();
            zrj$a.a = jsonPage.a;
            final boolean b2 = b instanceof xsj;
            final grs grs = null;
            xsj b3;
            if (b2) {
                b3 = (xsj)b;
            }
            else {
                b3 = null;
            }
            zrj$a.b = b3;
            zrj$a.c = jsonPage.c;
            zrj$a.d = jsonPage.e;
            zrj$a.e = jsonPage.d;
            final zrj c = (zrj)((h4j)zrj$a).e();
            final ssj$a ssj$a = new ssj$a();
            ssj$a.a = u4c.b();
            ssj$a.c = c;
            grs a = grs;
            if (b != null) {
                a = b.a();
            }
            ssj$a.b = a;
            return ((h4j)ssj$a).e();
        }
        finally {
            u4c.h();
        }
    }
}
