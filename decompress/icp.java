import java.util.List;
import android.util.Base64;
import kotlinx.serialization.json.JsonElement;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import kotlinx.serialization.json.JsonObject;

// 
// Decompiled by Procyon v0.6.0
// 

public final class icp extends pue implements stb<JsonObject, PublicKeyCredentialDescriptor>
{
    public static final icp F0;
    
    static {
        F0 = new icp();
    }
    
    public icp() {
        super(1);
    }
    
    public final Object invoke(Object value) {
        final JsonObject jsonObject = (JsonObject)value;
        final Object value2 = jsonObject.get((Object)"type");
        e0e.c(value2);
        final String content = hfe.o((JsonElement)value2).getContent();
        value = jsonObject.get((Object)"id");
        e0e.c(value);
        return new PublicKeyCredentialDescriptor(content, Base64.decode(hfe.o((JsonElement)value).getContent(), 11), (List)null);
    }
}
