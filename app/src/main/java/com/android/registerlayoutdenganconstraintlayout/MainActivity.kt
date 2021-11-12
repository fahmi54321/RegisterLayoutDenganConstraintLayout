package com.android.registerlayoutdenganconstraintlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.android.registerlayoutdenganconstraintlayout.ui.theme.RegisterLayoutDenganConstraintLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RegisterLayout()
        }
    }
}

@Composable
fun RegisterLayout() {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(start = 25.dp, end = 25.dp)
            .background(Color.White)
    ) {
        val (
            title, inputNama, inptNim, inputNoHp, inputAlamat, inputEmail, inputPassword, inputtConfPass, btnRegister, subTitle
        ) = createRefs()

        Text(
            text = "Register",
            fontSize = 24.sp,
            fontFamily = FontFamily(Font(R.font.aclonica)),
            color = Color(R.color.blue),
            modifier = Modifier
                .constrainAs(title) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top, 94.dp)
                }
        )

        OutlinedTextField(
            value = "Nama Lengkap",
            onValueChange = {},
            textStyle = TextStyle(
                color = Color(R.color.blue),
                fontFamily = FontFamily(Font(R.font.poppins_reguler)),
                fontSize = 14.sp
            ),
            modifier = Modifier
                .constrainAs(inputNama) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(title.bottom, 28.dp)
                },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            )
        )

        OutlinedTextField(
            value = "No identitas",
            onValueChange = {},
            textStyle = TextStyle(
                color = Color(R.color.blue),
                fontFamily = FontFamily(Font(R.font.poppins_reguler)),
                fontSize = 14.sp
            ),
            modifier = Modifier
                .constrainAs(inptNim) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(inputNama.bottom, 28.dp)
                },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            )
        )

        OutlinedTextField(
            value = "No hp",
            onValueChange = {},
            textStyle = TextStyle(
                color = Color(R.color.blue),
                fontFamily = FontFamily(Font(R.font.poppins_reguler)),
                fontSize = 14.sp
            ),
            modifier = Modifier
                .constrainAs(inputNoHp) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(inptNim.bottom, 28.dp)
                },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            )
        )

        OutlinedTextField(
            value = "Alamat",
            onValueChange = {},
            textStyle = TextStyle(
                color = Color(R.color.blue),
                fontFamily = FontFamily(Font(R.font.poppins_reguler)),
                fontSize = 14.sp
            ),
            modifier = Modifier
                .constrainAs(inputAlamat) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(inputNoHp.bottom, 28.dp)
                },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            )
        )

        OutlinedTextField(
            value = "Email address",
            onValueChange = {},
            textStyle = TextStyle(
                color = Color(R.color.blue),
                fontFamily = FontFamily(Font(R.font.poppins_reguler)),
                fontSize = 14.sp
            ),
            modifier = Modifier
                .constrainAs(inputEmail) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(inputAlamat.bottom, 28.dp)
                },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            )
        )

        OutlinedTextField(
            value = "Password",
            onValueChange = {},
            textStyle = TextStyle(
                color = Color(R.color.blue),
                fontFamily = FontFamily(Font(R.font.poppins_reguler)),
                fontSize = 14.sp
            ),
            modifier = Modifier
                .constrainAs(inputPassword) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(inputEmail.bottom, 28.dp)
                },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            )
        )

        OutlinedTextField(
            value = "Confirm Password",
            onValueChange = {},
            textStyle = TextStyle(
                color = Color(R.color.blue),
                fontFamily = FontFamily(Font(R.font.poppins_reguler)),
                fontSize = 14.sp
            ),
            modifier = Modifier
                .constrainAs(inputtConfPass) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(inputPassword.bottom, 28.dp)
                },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            )
        )

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .width(178.dp)
                .constrainAs(btnRegister) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(inputtConfPass.bottom, 32.dp)
                }
        ) {
            Text(
                text = "Register",
                fontFamily = FontFamily(Font(R.font.poppins_bold)),
                fontSize = 18.sp
            )
        }

        Row(
            modifier = Modifier
                .constrainAs(subTitle) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(btnRegister.bottom, 15.dp)
                }
        ) {
            Text(
                text = "Already Have an Account ?",
                color = Color(R.color.blue),
                fontFamily = FontFamily(Font(R.font.poppins_reguler)),
                fontSize = 12.sp
            )

            Text(
                text = "Sign In",
                color = Color(R.color.blue),
                fontFamily = FontFamily(Font(R.font.poppins_bold)),
                fontSize = 12.sp
            )
        }
    }

}

@Preview
@Composable
fun PreviewRegisterLayout() {
    RegisterLayout()
}