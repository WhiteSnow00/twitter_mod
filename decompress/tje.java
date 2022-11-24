import com.twitter.model.json.traffic.JsonDnsRecord;
import com.twitter.model.json.traffic.JsonCandidate;
import com.twitter.model.json.common.JsonModelRegistry$a;
import com.twitter.model.json.common.JsonModelRegistry$b;
import com.twitter.model.json.common.JsonModelRegistry$Registrar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tje implements JsonModelRegistry$Registrar
{
    public final void a(final JsonModelRegistry$b jsonModelRegistry$b) {
        final JsonModelRegistry$a jsonModelRegistry$a = (JsonModelRegistry$a)jsonModelRegistry$b;
        jsonModelRegistry$a.b((Class)ug3.class, (Class)JsonCandidate.class, (gra)null);
        jsonModelRegistry$a.b((Class)h59.class, (Class)JsonDnsRecord.class, (gra)null);
    }
}
