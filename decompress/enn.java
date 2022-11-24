import java.util.Iterator;
import java.util.List;
import tv.periscope.android.api.PsAudioSpace;
import java.util.ArrayList;
import tv.periscope.android.api.PsCreatedSpacesHistoryResponse;

// 
// Decompiled by Procyon v0.6.0
// 

public final class enn extends pue implements stb<PsCreatedSpacesHistoryResponse, b67>
{
    public static final enn F0;
    
    static {
        F0 = new enn();
    }
    
    public enn() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final PsCreatedSpacesHistoryResponse psCreatedSpacesHistoryResponse = (PsCreatedSpacesHistoryResponse)o;
        e0e.f((Object)psCreatedSpacesHistoryResponse, "response");
        final String cursor = psCreatedSpacesHistoryResponse.getCursor();
        final List audiospaces = psCreatedSpacesHistoryResponse.getAudiospaces();
        ArrayList list2;
        if (audiospaces != null) {
            final ArrayList list = new ArrayList(nr4.d1((Iterable)audiospaces, 10));
            final Iterator iterator = audiospaces.iterator();
            while (true) {
                list2 = list;
                if (!iterator.hasNext()) {
                    break;
                }
                list.add((Object)dnl.l((PsAudioSpace)iterator.next(), false));
            }
        }
        else {
            list2 = null;
        }
        return new b67(cursor, (List)list2);
    }
}
