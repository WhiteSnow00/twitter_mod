// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.search.implementation.results;

import java.io.IOException;
import java.util.Objects;
import android.os.Parcel;
import android.os.Parcelable$Creator;

@xoe
public class SearchPageInfoFactory$SavedState<OBJ extends SearchPageInfoFactory> extends zp1<OBJ>
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<SearchPageInfoFactory$SavedState>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new SearchPageInfoFactory$SavedState(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new SearchPageInfoFactory$SavedState[n];
            }
        };
    }
    
    public SearchPageInfoFactory$SavedState(final Parcel parcel) {
        super(parcel);
    }
    
    public SearchPageInfoFactory$SavedState(final OBJ obj) {
        super((Object)obj);
    }
    
    public OBJ deserializeValue(final vlp vlp, final OBJ obj) throws IOException, ClassNotFoundException {
        final SearchPageInfoFactory searchPageInfoFactory = (SearchPageInfoFactory)super.deserializeValue(vlp, (Object)obj);
        final qv$b f = qv.f;
        Objects.requireNonNull(vlp);
        searchPageInfoFactory.a = (qv)((y4j)f).a(vlp);
        return (OBJ)searchPageInfoFactory;
    }
    
    public /* bridge */ Object deserializeValue(final vlp vlp, final Object o) throws IOException, ClassNotFoundException {
        return this.deserializeValue(vlp, (SearchPageInfoFactory)o);
    }
    
    public void serializeValue(final wlp wlp, final OBJ obj) throws IOException {
        super.serializeValue(wlp, (Object)obj);
        wlp.A((Object)obj.a, (rlp)qv.f);
    }
    
    public /* bridge */ void serializeValue(final wlp wlp, final Object o) throws IOException {
        this.serializeValue(wlp, (SearchPageInfoFactory)o);
    }
}
