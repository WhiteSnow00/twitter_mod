// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android;

import java.io.IOException;
import android.os.Parcel;
import android.os.Parcelable$Creator;

@lpe
public class TemporaryAppPasswordContentViewProvider$SavedState<OBJ extends TemporaryAppPasswordContentViewProvider> extends dq1<OBJ>
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new TemporaryAppPasswordContentViewProvider$SavedState$a();
    }
    
    public TemporaryAppPasswordContentViewProvider$SavedState(final Parcel parcel) {
        super(parcel);
    }
    
    public TemporaryAppPasswordContentViewProvider$SavedState(final OBJ obj) {
        super((Object)obj);
    }
    
    public OBJ deserializeValue(final elp elp, final OBJ obj) throws IOException, ClassNotFoundException {
        final TemporaryAppPasswordContentViewProvider temporaryAppPasswordContentViewProvider = (TemporaryAppPasswordContentViewProvider)super.deserializeValue(elp, (Object)obj);
        temporaryAppPasswordContentViewProvider.b1 = elp.u();
        return (OBJ)temporaryAppPasswordContentViewProvider;
    }
    
    public void serializeValue(final flp flp, final OBJ obj) throws IOException {
        super.serializeValue(flp, (Object)obj);
        flp.t(obj.b1);
    }
}
