<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration</title>
    <link rel="stylesheet" href="css/Registration.css">
    <link rel="stylesheet" href="./fontawesome-free-6.4.2-web/css/all.css">
</head>
<body>
    <div class="main">
        <nav>
            <div class="logo">N<span>i</span>B<span>-</span>L<span>i</span>nk</div>
            <div>
            <button><a href="Home.html">Home</a></button>
            </div>
        </nav>
        <div class="body">
        <div class="container">
        <header>Registration</header>
        <form action="/register" method="post">
            <div class="form first">
                <div class="details personal">
                    <span class="title">Personal Details</span>
                    <div class="fields">
                        <div class="input-field">
                            <label for="">Full Name</label>
                            <input type="text" name="name" placeholder="Enter your name" autocomplete="off" required>
                        </div>
                        <div class="input-field">
                            <label for="">Date of Birth</label>
                            <input type="date" name="dob" placeholder="Enter date of birth" autocomplete="off" required>
                        </div>
                        <div class="input-field">
                            <label for="">Email</label>
                            <input type="email" name="email" placeholder="Enter your email" autocomplete="off" required>
                        </div>

                        <div class="input-field">
                            <label for="">Mobile Number</label>
                            <input type="number" name="phone" placeholder="Enter phone number" autocomplete="off" required>
                        </div>
                        <div class="input-field">
                            <label for="">Gender</label>
                            <input list="Gender" name="gender" placeholder="Mention your gender" autocomplete="off" required>
                            <datalist id="Gender">
                                <option value="Male">
                                <option value="Female">
                                <option value="Other">
                            </datalist>
                        </div>
                        <div class="input-field">
                            <label for="">Education</label>
                            <input type="text" name="education" placeholder="Enter your highest education" autocomplete="off" required>
                        </div>
                    </div>
                </div>

                <div class="details ID">
                    <span class="title">Identity Details</span>
                    <div class="fields">
                        <div class="input-field">
                            <label for="">Adhar</label>
                            <input type="number" name="adhar" placeholder="Enter Adhar number" autocomplete="off" required>
                        </div>
                        <div class="input-field">
                            <label for="">Pancard</label>
                            <input type="text" name="pan" placeholder="Enter PAN card number" autocomplete="off" required>
                        </div>
                        <div class="input-field">
                            <label for="">Driving License(DL)</label>
                            <input type="text" name="dl" placeholder="Enter Driving license number" autocomplete="off" required>
                        </div>

                        <div class="input-field">
                            <label for="">Enter a user name</label>
                            <input type="text" name="user" placeholder="Enter username" autocomplete="off" required>
                        </div>
                        <div class="input-field">
                            <label for="">Enter a Strong Password</label>
                            <input type="password" name="pass" placeholder="Enter Password" autocomplete="off" required>
                        </div>
                        <div class="input-field">
                            <label for="">Re-Enter the Password</label>
                            <input type="password" name="passc" placeholder="Enter Password" autocomplete="off" required>
                        </div>
                    </div>
                    <button class="nextBtn">
                        <span class="btnText">Next</span>
                        <i class="fa-solid fa-person-walking-arrow-right"></i>
                    </button>
                </div>
            </div>

            <div class="form second">
                <div class="details address">
                    <span class="title">Address Details</span>
                    <div class="fields">
                        <div class="input-field">
                            <label for="">Your Current Address Type</label>
                            <input list="address" name="addresstype" placeholder="Enter Address Type" autocomplete="off" required>
                            <datalist id="address">
                            <option value="Permanent">
                            <option value="Temporary">
                            </datalist>
                        </div>
                        <div class="input-field">
                            <label for="">Place</label>
                            <input type="text" name="place" placeholder="Enter place" autocomplete="off" required>
                        </div>
                        <div class="input-field">
                            <label for="">State</label>
                            <input list="state" name="state" placeholder="Enter state" autocomplete="off" required>
                            <datalist id="state">
                                <option value="Kerala">
                                <option value="Other">
                            </datalist>
                        </div>

                        <div class="input-field">
                            <label for="">District</label>
                            <input list="district" name="district" placeholder="Enter district" autocomplete="off" required>
                            <datalist id="district">
                                <option value="Thiruvananthapuram">
                                <option value="Other">
                            </datalist>
                        </div>
                        <div class="input-field">
                            <label for="">Thaluk</label>
                            <input list="thaluk" name="thaluk" placeholder="Enter thaluk" autocomplete="off" required>
                            <datalist id="thaluk">
                                <option value="Neyyattinkara">
                                <option value="Other">
                            </datalist>
                        </div>
                        <div class="input-field">
                            <label for="">Local Body</label>
                            <input list="local" name="local" placeholder="Enter Local body" autocomplete="off" required>
                            <datalist id="local">
                                <option value="Muncipal Corparation">
                                <option value="Muncipality">
                                <option value="Panchayath">
                            </datalist>
                        </div>
                    </div>
                </div>

                <div class="details family">
                    <span class="title">Personal Details</span>
                    <div class="fields">
                        <div class="input-field">
                            <label for="">Father Name</label>
                            <input type="text" name="father" placeholder="Enter father name" autocomplete="off" required>
                        </div>
                        <div class="input-field">
                            <label for="">Mother Name</label>
                            <input type="text" name="mother" placeholder="Enter mother name" autocomplete="off" required>
                        </div>
                        <div class="input-field">
                            <label for="">Marital Status</label>
                            <input list="status" name="merital" placeholder="Your Marital Status" autocomplete="off" required>
                            <datalist id="status">
                                <option value="Married">
                                <option value="Unmarried">
                                <option value="Widow">
                            </datalist>
                        </div>

                        <div class="input-field">
                            <label for="">Spouse Name</label>
                            <input list="spouse" name="spouse" placeholder="Enter spouse name" autocomplete="off" required>
                            <datalist id="spouse">
                                <option value="Nill">
                            </datalist>
                        </div>
                        <div class="input-field">
                            <label for="">Number of children</label>
                            <input list="children" name="children" placeholder="Enter number of children" autocomplete="off" required>
                            <datalist id="children">
                                <option value="Nill">
                            </datalist>
                        </div>
                        <div class="input-field">
                            <label for="">Religion and cast</label>
                            <input type="text" name="religion" placeholder="Your Religion and cast" autocomplete="off" required>
                        </div>
                    </div>
                    <div class="buttons">
                        <button class="backBtn">
                            <span class="btnText">Back</span>
                            <i class="fa-solid fa-person-walking-arrow-loop-left"></i>
                        </button>
                        <button class="next1Btn">
                            <span class="btnText">Next</span>
                            <i class="fa-solid fa-person-walking-arrow-right"></i>
                        </button>
                    </div>
                </div>
            </div>

            <div class="form third">
                <div class="details address">
                    <span class="title">About Field you Expert</span>
                    <div class="fields">
                        <div class="input-field">
                            <label for="">Working mode</label>
                            <input list="workmode" name="mode" placeholder="Enter Working mode" autocomplete="off" required>
                            <datalist id="workmode">
                            <option value="Full time">
                            <option value="Part time">
                            <option value="Once in  while">
                            </datalist>
                        </div>
                        <div class="input-field">
                            <label for="">Field of work</label>
                            <input list="field" name="field" placeholder="Enter field" autocomplete="off" required>
                                <datalist id="field">
                                <option value="Construction work">
                                <option value="Electrical work">
                                <option value="Plumbing work">
                                <option value="Wood cutting work">
                                <option value="Aluminium fabric work">
                                <option value="Water purification work">
                                <option value="Tree climbing work">
                                <option value="Farming work">
                                <option value="Gardening work">
                                <option value="Steel work">
                                <option value="Welding work">
                                <option value="Carpender work">
                                </datalist>
                        </div>
                        <div class="input-field">
                            <label for="">Post office pincode</label>
                            <input type="number" name="pin" placeholder="Enter your post office pin" autocomplete="off" required>
                        </div>

                        <div class="input-field">
                            <label for="">Distance level you have prefer</label>
                            <input list="distance" name="distance" placeholder="Select your level" autocomplete="off" required>
                            <datalist id="distance">
                                <option value="local">
                                <option value="thaluk">
                                <option value="district">
                                <option value="state">
                                <option value="country">
                            </datalist>
                        </div>
                        <div class="input-field">
                            <label for="">Payment per hour you want</label>
                            <input type="number" name="payment" placeholder="Enter your payment for an hour" autocomplete="off" required>
                        </div>
                        <div class="input-field">
                            <label for="">Commission percentage of salary</label>
                            <input type="number" value="2.0" name="commission" autocomplete="off" readonly>
                        </div>
                    </div>
                </div>

                <div class="details family">
                    <span class="title">Bank Details</span>
                    <div class="fields">
                        <div class="input-field">
                            <label for="">Name of the Bank</label>
                            <input type="text" name="bank" placeholder="Enter your bank" autocomplete="off" required>
                        </div>
                        <div class="input-field">
                            <label for="">Branch</label>
                            <input type="text" name="branch" placeholder="Bank branch" autocomplete="off" required>
                        </div>
                        <div class="input-field">
                            <label for="">IFSC Code</label>
                            <input type="text" name="ifsc" placeholder="Enter ifsc code" autocomplete="off" required>
                        </div>

                        <div class="input-field">
                            <label for="">Account Number</label>
                            <input type="number" name="account" placeholder="Enter account number" autocomplete="off" required>
                        </div>
                        <div class="input-field">
                            <label for="">Re-Enter account number</label>
                            <input type="number" name="accountc" placeholder="Enter Account number" autocomplete="off" required>
                        </div>
                        <div class="input-field">
                            <label for="">Enter a secret code</label>
                            <input type="password" name="secret" placeholder="Enter a code for validation" autocomplete="off" required>
                        </div>
                    </div>
                    <div class="buttons">
                        <button class="back1Btn">
                            <span class="btnText">Back</span>
                            <i class="fa-solid fa-person-walking-arrow-loop-left"></i>
                        </button>
                        <button type="submit">
                            <span class="btnText">Submit</span>
                            <i class="fa-solid fa-person-walking-arrow-right"></i>
                        </button>
                    </div>
                </div>
            </div>
        </form>
        </div>
        </div>
    </div>
    <script src="./fontawesome-free-6.4.2-web/js/all.js"></script>
    <script src="js/Registration.js"></script>
</body>
</html>