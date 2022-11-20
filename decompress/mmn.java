import java.util.Iterator;
import java.util.List;
import tv.periscope.android.api.PsAudioSpace;
import java.util.ArrayList;
import tv.periscope.android.api.PsCreatedSpacesHistoryResponse;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mmn extends ste implements qsb<PsCreatedSpacesHistoryResponse, w47>
{
    public static final mmn D0;
    
    static {
        D0 = new mmn();
    }
    
    public mmn() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final PsCreatedSpacesHistoryResponse psCreatedSpacesHistoryResponse = (PsCreatedSpacesHistoryResponse)o;
        czd.f((Object)psCreatedSpacesHistoryResponse, "response");
        final String cursor = psCreatedSpacesHistoryResponse.getCursor();
        final List audiospaces = psCreatedSpacesHistoryResponse.getAudiospaces();
        ArrayList list2;
        if (audiospaces != null) {
            final ArrayList list = new ArrayList(iq4.H((Iterable)audiospaces, 10));
            final Iterator iterator = audiospaces.iterator();
            while (true) {
                list2 = list;
                if (!iterator.hasNext()) {
                    break;
                }
                list.add((Object)rml.n((PsAudioSpace)iterator.next(), false));
            }
        }
        else {
            list2 = null;
        }
        return new w47(cursor, list2);
    }
}
