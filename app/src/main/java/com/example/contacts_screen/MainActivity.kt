package com.example.contacts_screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Backspace
import androidx.compose.material.icons.filled.ContactPhone
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PersonAdd
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.contacts_screen.ui.theme.Contacts_screenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Contacts_screenTheme {
                ContactsScreen()
            }
        }
    }
}

@Composable
fun ContactsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .statusBarsPadding()
    ) {
        // Top Bar
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                imageVector = Icons.Default.Menu,
                contentDescription = "Menu",
                modifier = Modifier.size(24.dp)
            )
            Text(
                text = "Mis Contactos",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color(0xFF1F2937)
            )
            Image(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "Profile",
                modifier = Modifier.size(28.dp)
            )
        }

        // Form Section
        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            // Nombre Label
            Text(
                text = "Nombre",
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                color = Color(0xFF374151)
            )
            Box(modifier = Modifier.height(8.dp))
            // Nombre Input Box (Manual Implementation)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(1.dp, Color(0xFFE5E7EB), RoundedCornerShape(12.dp))
                    .padding(14.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        imageVector = Icons.Default.Person,
                        contentDescription = null,
                        modifier = Modifier.size(20.dp),
                        colorFilter = ColorFilter.tint(Color(0xFF9CA3AF))
                    )
                    Box(modifier = Modifier.width(12.dp))
                    Text(text = "Ej: Juan Pérez", color = Color(0xFF9CA3AF), fontSize = 16.sp)
                }
            }

            Box(modifier = Modifier.height(16.dp))

            // Teléfono Label
            Text(
                text = "Teléfono",
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                color = Color(0xFF374151)
            )
            Box(modifier = Modifier.height(8.dp))
            // Teléfono Input Box (Manual Implementation)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(1.dp, Color(0xFFE5E7EB), RoundedCornerShape(12.dp))
                    .padding(14.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        imageVector = Icons.Default.Phone,
                        contentDescription = null,
                        modifier = Modifier.size(20.dp),
                        colorFilter = ColorFilter.tint(Color(0xFF9CA3AF))
                    )
                    Box(modifier = Modifier.width(12.dp))
                    Text(text = "+34 600 000 000", color = Color(0xFF9CA3AF), fontSize = 16.sp)
                }
            }

            Box(modifier = Modifier.height(24.dp))

            // Agregar Contacto Button (Manual Implementation)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF2563EB), RoundedCornerShape(12.dp))
                    .padding(vertical = 14.dp),
                contentAlignment = Alignment.Center
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        imageVector = Icons.Default.PersonAdd,
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(Color.White),
                        modifier = Modifier.size(20.dp)
                    )
                    Box(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Agregar Contacto",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                }
            }

            Box(modifier = Modifier.height(12.dp))

            // Limpiar Campos Button (Manual Implementation)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFF3F4F6), RoundedCornerShape(12.dp))
                    .padding(vertical = 14.dp),
                contentAlignment = Alignment.Center
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        imageVector = Icons.Default.Backspace,
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(Color(0xFF374151)),
                        modifier = Modifier.size(20.dp)
                    )
                    Box(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Limpiar Campos",
                        color = Color(0xFF374151),
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                }
            }
        }

        Box(modifier = Modifier.height(24.dp))

        // Section Header
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFF9FAFB))
                .padding(horizontal = 16.dp, vertical = 10.dp)
        ) {
            Text(
                text = "LISTA DE CONTACTOS",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF6B7280)
            )
        }

        // Contact List
        Column(modifier = Modifier.weight(1f)) {
            ContactItem(
                name = "Ana García",
                phone = "+34 612 345 678",
                avatarBg = Color(0xFFEEF2FF),
                avatarTint = Color(0xFF4F46E5)
            )
            ContactItem(
                name = "Carlos Rodríguez",
                phone = "+34 699 888 777",
                avatarBg = Color(0xFFECFDF5),
                avatarTint = Color(0xFF10B981)
            )
            ContactItem(
                name = "Elena Martínez",
                phone = "+34 655 443 322",
                avatarBg = Color(0xFFFEF3C7),
                avatarTint = Color(0xFFD97706)
            )
        }

        // Bottom Navigation (Manual Implementation)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .border(1.dp, Color(0xFFF3F4F6))
                .padding(vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            BottomNavItem("Contactos", Icons.Default.ContactPhone, Color(0xFF2563EB))
            BottomNavItem("Recientes", Icons.Default.History, Color(0xFF6B7280))
            BottomNavItem("Favoritos", Icons.Default.Star, Color(0xFF6B7280))
        }
        Box(modifier = Modifier.navigationBarsPadding())
    }
}

@Composable
fun ContactItem(name: String, phone: String, avatarBg: Color, avatarTint: Color) {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Avatar
            Box(
                modifier = Modifier
                    .size(44.dp)
                    .background(avatarBg, CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    imageVector = Icons.Default.Person,
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(avatarTint),
                    modifier = Modifier.size(24.dp)
                )
            }
            Box(modifier = Modifier.width(16.dp))
            // Contact Details
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = name,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = Color(0xFF111827)
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        imageVector = Icons.Default.Phone,
                        contentDescription = null,
                        modifier = Modifier.size(14.dp),
                        colorFilter = ColorFilter.tint(Color(0xFF6B7280))
                    )
                    Box(modifier = Modifier.width(4.dp))
                    Text(text = phone, color = Color(0xFF6B7280), fontSize = 14.sp)
                }
            }
            // Arrow Icon
            Image(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = null,
                colorFilter = ColorFilter.tint(Color(0xFFD1D5DB)),
                modifier = Modifier.size(24.dp)
            )
        }
        // Divider
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color(0xFFF3F4F6))
        )
    }
}

@Composable
fun BottomNavItem(label: String, icon: ImageVector, color: Color) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            imageVector = icon,
            contentDescription = label,
            colorFilter = ColorFilter.tint(color),
            modifier = Modifier.size(24.dp)
        )
        Box(modifier = Modifier.height(4.dp))
        Text(
            text = label,
            color = color,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ContactsScreenPreview() {
    Contacts_screenTheme {
        ContactsScreen()
    }
}
