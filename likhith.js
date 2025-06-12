function Likhith1() 
{
    return (
        <div>
            <form action="C:\Users\likhi\OneDrive\Desktop\html folder\crtp\hotel547\home.html">
           <fieldset>
            <legend align="center"><b>Login Form</b></legend>
                <label for="">First Name:</label>
                <input type="text" id="Fname" placeholder="First name"/><br/>
                <span  id="fnameerror"></span><br/>
                <label for="">Last Name:</label>
                <input type="text" id="Lname" placeholder="Second name"/><br/>
                <span  id="lnameerror"></span><br/>
                <label for="">Password:</label>
                <input type="password" id="pass" placeholder="Password"/><br/>
                <span  id="passerror"></span><br/>
                <label for="">phone number:</label>
                <input type="number" id="ph" placeholder="Enter the phone name"/><br/>
                <span  id="pherror"></span><br/>
                <label for="">Email id:</label>
                <input type="email" id="em" placeholder="Email"/><br/>
                <span  id="emerror"></span><br/>
                <label for="">Gender:</label><br/><br/>
                <input type="radio" name="t"/>Male
                <input type="radio" name="t"/>Female
                <input type="radio" name="t"/>Other <br/><br/>
                <label for="">Address</label><br/>
                <textarea placeholder="Enter the address"></textarea><br/><br/><br/>
                <button onclick="valid()">Register</button>
           </fieldset> 
        </form>

        </div>
    );
}
    export default Likhith1;
