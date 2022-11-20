import kotlinx.serialization.json.JsonElement;
import com.google.android.gms.fido.fido2.api.common.e;
import kotlinx.serialization.json.JsonObject;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lbp extends ste implements qsb<JsonObject, e>
{
    public static final lbp D0;
    
    static {
        D0 = new lbp();
    }
    
    public lbp() {
        super(1);
    }
    
    public final Object invoke(Object value) {
        final JsonObject jsonObject = (JsonObject)value;
        final Object value2 = jsonObject.get((Object)"type");
        czd.c(value2);
        final String content = jee.T((JsonElement)value2).getContent();
        value = jsonObject.get((Object)"alg");
        czd.c(value);
        return new e(content, jee.Q(jee.T((JsonElement)value)));
    }
}
