using UnityEngine; 
public class NewBehaviourScript : MonoBehaviour { 

    void Start () { 
        AndroidJNIHelper.debug = true; 
        using (AndroidJavaClass jc = new AndroidJavaClass("com.unity3d.player.UnityPlayer")) { 
            jc.CallStatic("UnitySendMessage", "Main Camera", "JavaMessage", "whoowhoo"); 
        } 
    } 

    void JavaMessage(string message) { 
        Debug.Log("message from java: " + message); 
    }
} 