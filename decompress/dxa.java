import java.io.IOException;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonFetchTopicsRequestInput;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dxa extends fk8<JsonFetchTopicsRequestInput, exa>
{
    public dxa() {
        super(exa.class);
    }
    
    @Override
    public final void i(final trc$a trc$a, Object d) {
        final JsonFetchTopicsRequestInput jsonFetchTopicsRequestInput = (JsonFetchTopicsRequestInput)d;
        try {
            d = new qkr(fjh.a((Object)jsonFetchTopicsRequestInput), rn6.I0);
        }
        catch (final IOException ex) {
            r9a.d((Throwable)ex);
            d = null;
        }
        trc$a.n("/1.1/onboarding/topics/fetch.json", "/");
        final int a = o5j.a;
        trc$a.e = asc$b.I0;
        trc$a.d = (vrc)d;
    }
}
