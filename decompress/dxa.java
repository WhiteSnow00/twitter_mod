import java.io.IOException;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonFetchTopicsRequestInput;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dxa extends rj8<JsonFetchTopicsRequestInput, exa>
{
    public dxa() {
        super(exa.class);
    }
    
    @Override
    public final void i(final qrc.a a, Object d) {
        final JsonFetchTopicsRequestInput jsonFetchTopicsRequestInput = (JsonFetchTopicsRequestInput)d;
        try {
            d = new ajr(mih.a((Object)jsonFetchTopicsRequestInput), fn6.F0);
        }
        catch (final IOException ex) {
            e9a.d((Throwable)ex);
            d = null;
        }
        a.n("/1.1/onboarding/topics/fetch.json", "/");
        final int a2 = w4j.a;
        a.e = xrc$b.F0;
        a.d = (src)d;
    }
}
