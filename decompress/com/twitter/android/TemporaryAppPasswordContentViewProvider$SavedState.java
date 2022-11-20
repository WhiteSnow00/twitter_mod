// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android;

import java.io.IOException;
import android.os.Parcel;
import android.os.Parcelable$Creator;

@xoe
public class TemporaryAppPasswordContentViewProvider$SavedState<OBJ extends TemporaryAppPasswordContentViewProvider> extends zp1<OBJ>
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<TemporaryAppPasswordContentViewProvider$SavedState>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new TemporaryAppPasswordContentViewProvider$SavedState(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new TemporaryAppPasswordContentViewProvider$SavedState[n];
            }
        };
    }
    
    public TemporaryAppPasswordContentViewProvider$SavedState(final Parcel parcel) {
        super(parcel);
    }
    
    public TemporaryAppPasswordContentViewProvider$SavedState(final OBJ obj) {
        super((Object)obj);
    }
    
    public OBJ deserializeValue(final vlp vlp, final OBJ obj) throws IOException, ClassNotFoundException {
        final TemporaryAppPasswordContentViewProvider temporaryAppPasswordContentViewProvider = (TemporaryAppPasswordContentViewProvider)super.deserializeValue(vlp, (Object)obj);
        temporaryAppPasswordContentViewProvider.c1 = vlp.s();
        return (OBJ)temporaryAppPasswordContentViewProvider;
    }
    
    public /* bridge */ Object deserializeValue(final vlp vlp, final Object o) throws IOException, ClassNotFoundException {
        return this.deserializeValue(vlp, (TemporaryAppPasswordContentViewProvider)o);
    }
    
    public void serializeValue(final wlp wlp, final OBJ obj) throws IOException {
        super.serializeValue(wlp, (Object)obj);
        wlp.r(obj.c1);
    }
    
    public /* bridge */ void serializeValue(final wlp wlp, final Object o) throws IOException {
        this.serializeValue(wlp, (TemporaryAppPasswordContentViewProvider)o);
    }
}
